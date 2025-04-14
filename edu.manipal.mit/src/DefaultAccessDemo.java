package edu.manipal.mit;

class Student {
    String name;
    int rollNumber;

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
    }
}

public class DefaultAccessDemo {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Satvik";
        student.rollNumber = 123;
        student.displayDetails();
    }
}
