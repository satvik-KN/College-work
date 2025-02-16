import java.util.Scanner;

public class L2q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Year of Birth: ");
        int birthYear = scanner.nextInt();
        int retirementYear = birthYear + 60;
        System.out.println("Expected Year of Retirement: " + retirementYear);
    }
}
