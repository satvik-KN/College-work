class BankAccount {
    String depositorName;
    int accountNumber;
    String accountType;
    double balanceAmount;
    static double rateOfInterest = 4.5;

    BankAccount() {
        depositorName = "Satvik";
        accountNumber = 0;
        accountType = "Savings";
        balanceAmount = 0.0;
    }

    BankAccount(String name, int accNum, String accType, double balance) {
        depositorName = name;
        accountNumber = accNum;
        accountType = accType;
        balanceAmount = balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balanceAmount += amount;
        }
    }

    void withdraw(double amount) {
        if (balanceAmount - amount >= 1000) {
            balanceAmount -= amount;
        } else {
            System.out.println("Withdrawal not allowed. Minimum balance must be maintained.");
        }
    }

    void display() {
        System.out.println("\n--- Account Details ---");
        System.out.println("Depositor Name: " + depositorName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance Amount: " + balanceAmount);
    }

    static void displayRateOfInterest() {
        System.out.println("\nRate of Interest: " + rateOfInterest + "%");
    }
}

public class L4q3 {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount();
        acc1.display();
        BankAccount.displayRateOfInterest();

        BankAccount acc2 = new BankAccount("Satvik", 12345, "Savings", 5000.0);
        acc2.display();
        acc2.deposit(2000);
        acc2.display();
        acc2.withdraw(2500);
        acc2.display();
        BankAccount.displayRateOfInterest();
    }
}
