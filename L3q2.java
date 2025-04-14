import java.util.Scanner;

class EMPLOYEE {
    String Ename;
    int Eid;
    double Basic;
    double DA;
    double Gross_Sal;
    double Net_Sal;

    void read(Scanner sc) {
        System.out.print("Enter Employee ID: ");
        Eid = sc.nextInt();
        sc.nextLine(); // consume leftover newline
        System.out.print("Enter Employee Name: ");
        Ename = sc.nextLine();
        System.out.print("Enter Basic Salary: ");
        Basic = sc.nextDouble();
    }

    void compute_net_sal() {
        DA = 0.52 * Basic;
        Gross_Sal = Basic + DA;
        double IT = 0.30 * Gross_Sal;
        Net_Sal = Gross_Sal - IT;
    }

    void display() {
        System.out.println("\n--- Employee Details ---");
        System.out.println("Employee ID: " + Eid);
        System.out.println("Employee Name: " + Ename);
        System.out.println("Basic Salary: " + Basic);
        System.out.println("DA: " + DA);
        System.out.println("Gross Salary: " + Gross_Sal);
        System.out.println("Net Salary: " + Net_Sal);
    }
}

public class L3q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        EMPLOYEE[] employees = new EMPLOYEE[n];

        for (int i = 0; i < n; i++) {
            employees[i] = new EMPLOYEE();
            System.out.println("\nEnter details for Employee " + (i + 1));
            employees[i].read(sc);
            employees[i].compute_net_sal();
        }

        for (int i = 0; i < n; i++) {
            employees[i].display();
        }

        sc.close();
    }
}
