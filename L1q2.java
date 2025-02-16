
import java.util.Scanner;

public class L1q2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();

            while (num2 != 0) {
                int carry = num1 & num2;
                num1 = num1 ^ num2;
                num2 = carry << 1;
            }

            System.out.println("Sum: " + num1);

            if ((num1 & 1) == 0) {
                System.out.println("The sum is Even.");
            } else {
                System.out.println("The sum is Odd.");
            }

        }
}


