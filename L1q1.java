import java.util.Scanner;
public class L1q1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter hours worked: ");
            double hoursWorked = scanner.nextDouble();

            System.out.print("Enter hourly rate: ");
            double hourlyRate = scanner.nextDouble();

            double salary;

            if (hoursWorked <= 40) {
                salary = hoursWorked * hourlyRate;
            } else {
                salary = 40 * hourlyRate + (hoursWorked - 40) * hourlyRate * 1.5;
            }

            System.out.println("Total Salary: $" + salary);

        }
    }


