class STUDENT {
    String sname;
    Subject subjects[];
    int numSubjects;
    int total;
    double avg;

    STUDENT() {
        sname = "Satvik";
        subjects = new Subject[5];
        numSubjects = 0;
        total = 0;
        avg = 0.0;
    }

    class Subject {
        String subjectName;
        int marks;

        Subject(String subjectName, int marks) {
            this.subjectName = subjectName;
            this.marks = marks;
        }

        void display() {
            System.out.println("Subject: " + subjectName + ", Marks: " + marks);
        }
    }

    void addSubject(String subjectName, int marks) {
        if (numSubjects < subjects.length) {
            subjects[numSubjects++] = new Subject(subjectName, marks);
        }
    }

    void compute() {
        total = 0;
        for (int i = 0; i < numSubjects; i++) {
            total += subjects[i].marks;
        }
        avg = (double) total / numSubjects;
    }

    void display() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + sname);
        for (int i = 0; i < numSubjects; i++) {
            subjects[i].display();
        }
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + avg);
    }
}

public class L5q1 {
    public static void main(String[] args) {
        STUDENT student = new STUDENT();
        student.addSubject("Math", 85);
        student.addSubject("Physics", 90);
        student.addSubject("Chemistry", 80);
        student.compute();
        student.display();
    }
}
