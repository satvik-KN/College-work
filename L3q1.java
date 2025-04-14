import java.util.Scanner;

class STUDENT {

    String sname;
    int[] marks_array;
    int total;
    double avg;
    void assign() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name: ");
        sname = sc.nextLine();
        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();
        marks_array = new int[n];
        System.out.println("Enter marks for " + n + " subjects:");
        for (int i = 0; i < n; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks_array[i] = sc.nextInt();
        }
    }

    void compute() {
        total = 0;
        for (int mark : marks_array) {
            total += mark;
        }
        avg = (double) total / marks_array.length;
    }

    void display() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + sname);
        System.out.println("Marks:");
        for (int i = 0; i < marks_array.length; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks_array[i]);
        }
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + avg);
    }
}

public class L3q1 {
    public static void main(String[] args) {
        STUDENT student = new STUDENT();
        student.assign();
        student.compute();
        student.display();
    }
}
