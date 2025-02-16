import java.util.Scanner;

public class L2q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalUnits = 0;
        System.out.println("Enter daily electricity consumption in units for 7 days:");
        for (int i = 1; i <= 7; i++) {
            System.out.print("Day " + i + ": ");
            totalUnits += scanner.nextInt();
        }

        double billAmount = 0;
        switch (totalUnits / 50) {
            case 0:
                billAmount = totalUnits * 2.0;
                break;
            case 1:
                billAmount = 50 * 2.0 + (totalUnits - 50) * 3.5;
                break;
            case 2:
                billAmount = 50 * 2.0 + 50 * 3.5 + (totalUnits - 100) * 5.0;
                break;
            default:
                billAmount = 50 * 2.0 + 50 * 3.5 + 50 * 5.0 + (totalUnits - 150) * 7.0;
                break;
        }

        System.out.println("Total Electricity Bill: INR " + billAmount);

    }
}
