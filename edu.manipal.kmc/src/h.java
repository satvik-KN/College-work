package edu.manipal.mit;

public class PrivateAccessDemo {
    public static void main(String[] args) {
        Student2 student = new Student2();

        // Using setter methods to assign values
        student.setName("Satvik");
        student.setRollNumber(123);

        // Displaying the details
        student.displayDetails();

        // The following lines will cause compilation errors because 'name' and 'rollNumber' are private
        // System.out.println(student.name);      // Error: name has private access in Student2
        // System.out.println(student.rollNumber); // Error: rollNumber has private access in Student2
    }
}
