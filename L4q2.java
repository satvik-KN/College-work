class EMPLOYEE {
    String Ename;
    int Eid;
    double Basic, DA, Gross_Sal, Net_Sal;

    // Default Constructor
    EMPLOYEE() {
        Ename = "Satvik";
        Eid = 0;
        Basic = 0.0;
        compute_net_sal();
    }

    // Parameterized Constructor
    EMPLOYEE(String name, int id, double basic) {
        Ename = name;
        Eid = id;
        Basic = basic;
        compute_net_sal();
    }

    void compute_net_sal() {
        DA = 0.52 * Basic;
        Gross_Sal = Basic + DA;
        double IT = 0.30 * Gross_Sal;
        Net_Sal = Gross_Sal - IT;
    }

    void display() {
        System.out.println("\n--- Employee Details ---");
        System.out.println("Employee Name: " + Ename);
        System.out.println("Employee ID: " + Eid);
        System.out.println("Basic Salary: " + Basic);
        System.out.println("DA: " + DA);
        System.out.println("Gross Salary: " + Gross_Sal);
        System.out.println("Net Salary: " + Net_Sal);
    }
}

public class L4q2 {
    public static void main(String[] args) {
        EMPLOYEE emp1 = new EMPLOYEE();
        emp1.display();

        EMPLOYEE emp2 = new EMPLOYEE("Satvik", 101, 50000);
        emp2.display();
    }
}
