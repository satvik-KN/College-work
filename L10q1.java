class Student {
    private String name;
    private int age;

    public void registerStudent(String name, int age) {
        if (age < 18 || age > 60) {
            throw new IllegalArgumentException("Age must be between 18 and 60");
        }
        this.name = name;
        this.age = age;
        System.out.println("Student Registered: " + name + ", Age: " + age);
    }
}

public class L10q1 {
    public static void main(String[] args) {
        Student student = new Student();

        // Valid registration
        try {
            student.registerStudent("Satvik", 25);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Invalid registration
        try {
            student.registerStudent("John Doe", 17);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            student.registerStudent("Alice", 65);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
