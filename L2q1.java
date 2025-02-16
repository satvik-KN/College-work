import java.util.Scanner;

public class L2q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the total distance traveled: ");
        double distance = scanner.nextDouble();
        double fare = 0;

        if (distance <= 5) {
            fare = distance * 10;
        } else if (distance <= 20) {
            fare = (5 * 10) + (distance - 5) * 8;
        } else {
            fare = (5 * 10) + (15 * 8) + (distance - 20) * 5;
        }

        System.out.println("Total Fare: INR " + fare);
    }
}

