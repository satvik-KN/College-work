import java.util.Scanner;

public class L6q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str, reversedStr;
        int choice;

        System.out.print("Enter a string: ");
        str = sc.nextLine();

        while (true) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Check Palindrome");
            System.out.println("2. Sort String Alphabetically");
            System.out.println("3. Reverse the String");
            System.out.println("4. Concatenate Original and Reversed String");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            if (choice == 1) {
                if (isPalindrome(str)) {
                    System.out.println("The string is a palindrome.");
                } else {
                    System.out.println("The string is not a palindrome.");
                }
            } else if (choice == 2) {
                System.out.println("Sorted String: " + sortStringAlphabetically(str));
            } else if (choice == 3) {
                reversedStr = reverseString(str);
                System.out.println("Reversed String: " + reversedStr);
            } else if (choice == 4) {
                reversedStr = reverseString(str);
                System.out.println("Concatenated String: " + str + reversedStr);
            } else if (choice == 5) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid choice, please try again.");
            }
        }

        sc.close();
    }

    static boolean isPalindrome(String str) {
        String reversed = reverseString(str);
        return str.equals(reversed);
    }

    static String sortStringAlphabetically(String str) {
        char[] chars = str.toCharArray();
        java.util.Arrays.sort(chars);
        return new String(chars);
    }

    static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }
}
