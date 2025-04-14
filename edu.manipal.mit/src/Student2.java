package edu.manipal.mit;

public class Student2 {
    private String name;
    private int rollNumber;

    // Public setter methods to assign values
    public void setName(String name) {
        this.name = name;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    // Public method to display details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
    }
}
