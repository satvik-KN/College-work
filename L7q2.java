class EMPLOYEE {
    String eName;
    double salary;

    EMPLOYEE(String name, double salary) {
        eName = name;
        this.salary = salary;
    }

    void calculateSalary() {
        System.out.println("Salary: " + salary);
    }

    void displayEmployeeDetails() {
        System.out.println("Employee Name: " + eName);
    }
}

class PartTimeEmp extends EMPLOYEE {
    int hoursWorked;
    static final double hourlyRate = 20.0;

    PartTimeEmp(String name, int hoursWorked) {
        super(name, 0);
        this.hoursWorked = hoursWorked;
    }

    @Override
    void calculateSalary() {
        salary = hoursWorked * hourlyRate;
    }

    @Override
    void displayEmployeeDetails() {
        super.displayEmployeeDetails();
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Hourly Rate: " + hourlyRate);
        System.out.println("Calculated Salary: " + salary);
    }
}

class FullTimeEmp extends EMPLOYEE {
    double bonus;
    double deductions;

    FullTimeEmp(String name, double salary, double bonus, double deductions) {
        super(name, salary);
        this.bonus = bonus;
        this.deductions = deductions;
    }

    @Override
    void calculateSalary() {
        salary = salary + bonus - deductions;
    }

    @Override
    void displayEmployeeDetails() {
        super.displayEmployeeDetails();
        System.out.println("Bonus: " + bonus);
        System.out.println("Deductions: " + deductions);
        System.out.println("Calculated Salary: " + salary);
    }
}

public class L7q2 {
    public static void main(String[] args) {
        PartTimeEmp partTimeEmp = new PartTimeEmp("Satvik", 100);
        partTimeEmp.calculateSalary();
        partTimeEmp.displayEmployeeDetails();

        System.out.println();

        FullTimeEmp fullTimeEmp = new FullTimeEmp("John Doe", 5000, 1000, 200);
        fullTimeEmp.calculateSalary();
        fullTimeEmp.displayEmployeeDetails();
    }
}

