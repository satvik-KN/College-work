import java.util.Scanner;

class EMPLOYEE {
    String eName;
    double salary;

    EMPLOYEE(String name, double salary) {
        eName = name;
        this.salary = salary;
    }

    String formatEmployeeName() {
        String[] nameParts = eName.split(" ");
        StringBuilder formattedName = new StringBuilder();
        for (String part : nameParts) {
            formattedName.append(part.substring(0, 1).toUpperCase()).append(part.substring(1).toLowerCase()).append(" ");
        }
        return formattedName.toString().trim();
    }

    String generateEmail() {
        String[] nameParts = eName.split(" ");
        String email = nameParts[0].toLowerCase().charAt(0) + nameParts[1].toLowerCase() + "@example.com";
        return email;
    }

    void display() {
        System.out.println("\nEmployee Name: " + formatEmployeeName());
        System.out.println("Salary: " + salary);
        System.out.println("Email: " + generateEmail());
    }
}

public class L6q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline

        EMPLOYEE[] employees = new EMPLOYEE[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter employee name (First Last): ");
            String name = sc.nextLine();
            System.out.print("Enter salary: ");
            double salary = sc.nextDouble();
            sc.nextLine(); // Consume newline
            employees[i] = new EMPLOYEE(name, salary);
        }

        for (int i = 0; i < n; i++) {
            employees[i].display();
        }

        sc.close();
    }
}
