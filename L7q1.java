class STUDENT {
    String sName;
    int[] marks;
    int total;
    double avg;

    STUDENT(String name, int[] marks) {
        this.sName = name;
        this.marks = marks;
    }

    void compute() {
        total = 0;
        for (int mark : marks) {
            total += mark;
        }
        avg = total / (double) marks.length;
    }

    void display() {
        System.out.println("Name: " + sName);
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + avg);
    }
}

class ScienceStudent extends STUDENT {
    int practicalMarks;

    ScienceStudent(String name, int[] marks, int practicalMarks) {
        super(name, marks);
        this.practicalMarks = practicalMarks;
    }

    @Override
    void compute() {
        super.compute();
        total += practicalMarks;
        avg = total / (double) (marks.length + 1);  // Including practical subject
    }

    void displayPracticalMarks() {
        System.out.println("Practical Marks: " + practicalMarks);
    }

    @Override
    void display() {
        super.display();
        displayPracticalMarks();
    }
}

class ArtsStudent extends STUDENT {
    String electiveSubject;

    ArtsStudent(String name, int[] marks, String electiveSubject) {
        super(name, marks);
        this.electiveSubject = electiveSubject;
    }

    void displayElectiveSubject() {
        System.out.println("Elective Subject: " + electiveSubject);
    }

    @Override
    void display() {
        super.display();
        displayElectiveSubject();
    }
}

public class L7q1 {
    public static void main(String[] args) {
        int[] marks1 = {85, 90, 78};
        int[] marks2 = {88, 92, 80};
        int[] marks3 = {75, 88, 70};

        ScienceStudent scienceStudent = new ScienceStudent("Satvik", marks1, 85);
        ArtsStudent artsStudent = new ArtsStudent("John Doe", marks2, "History");

        STUDENT student = new STUDENT("Jane Doe", marks3);

        student.compute();
        student.display();

        System.out.println("\nScience Student Details:");
        scienceStudent.compute();
        scienceStudent.display();

        System.out.println("\nArts Student Details:");
        artsStudent.compute();
        artsStudent.display();

        // Demonstrating dynamic polymorphism
        STUDENT polymorphicStudent = scienceStudent;
        polymorphicStudent.display();

        polymorphicStudent = artsStudent;
        polymorphicStudent.display();
    }
}
