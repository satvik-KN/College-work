class STUDENT {
    String sname;
    int[] marks_array;
    int total;
    double avg;

    STUDENT() {
        sname = "Satvik";
        marks_array = new int[0];
        total = 0;
        avg = 0.0;
    }

    STUDENT(String name, int[] marks) {
        sname = name;
        marks_array = marks;
        compute();
    }

    void compute() {
        total = 0;
        for (int mark : marks_array) {
            total += mark;
        }
        avg = marks_array.length > 0 ? (double) total / marks_array.length : 0;
    }

    void display() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + sname);
        System.out.print("Marks: ");
        for (int mark : marks_array) {
            System.out.print(mark + " ");
        }
        System.out.println("\nTotal: " + total);
        System.out.println("Average: " + avg);
    }
}

public class L4q1 {
    public static void main(String[] args) {
        STUDENT student1 = new STUDENT();
        student1.display();

        int[] marks = {85, 90, 78, 92};
        STUDENT student2 = new STUDENT("Satvik", marks);
        student2.display();
    }
}
