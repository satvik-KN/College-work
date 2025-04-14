package edu.manipal.kmc;

import edu.manipal.mit.Student;

public class TestStudent {
    public static void main(String[] args) {
        // This will cause a compilation error because the Student class has default access
        Student student = new Student();
    }
}
