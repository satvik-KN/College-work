class EMPLOYEE {
    String eName;
    double salary;
    Department[] departments;
    int numDepartments;

    EMPLOYEE() {
        eName = "Satvik";
        salary = 0.0;
        departments = new Department[5];
        numDepartments = 0;
    }

    class Department {
        String departmentName;
        String location;

        Department(String departmentName, String location) {
            this.departmentName = departmentName;
            this.location = location;
        }

        void display() {
            System.out.println("Department Name: " + departmentName + ", Location: " + location);
        }

        void setDepartmentDetails(String departmentName, String location) {
            this.departmentName = departmentName;
            this.location = location;
        }
    }

    void addDepartment(String departmentName, String location) {
        if (numDepartments < departments.length) {
            departments[numDepartments++] = new Department(departmentName, location);
        }
    }

    void display() {
        System.out.println("\n--- Employee Details ---");
        System.out.println("Employee Name: " + eName);
        System.out.println("Salary: " + salary);
        for (int i = 0; i < numDepartments; i++) {
            departments[i].display();
        }
    }
}

public class L5q2 {
    public static void main(String[] args) {
        EMPLOYEE employee = new EMPLOYEE();
        employee.addDepartment("HR", "New York");
        employee.addDepartment("Finance", "London");
        employee.salary = 50000;
        employee.display();
    }
}
