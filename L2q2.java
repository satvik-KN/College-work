import java.util.Scanner;

public class L2q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the 9-digit registration number: ");
        String regNo = scanner.next();

        if (regNo.length() == 9) {
            String yearPrefix = regNo.substring(0, 2);
            int year = Integer.parseInt(yearPrefix);
            year = (year >= 50) ? (1900 + year) : (2000 + year);
            System.out.println("Year of Joining: " + year);
        } else {
            System.out.println("Invalid registration number! Must be 9 digits.");
        }
    }
}
