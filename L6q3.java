import java.util.Scanner;
import java.util.Arrays;

class STUDENT {
    String sName;
    int marks[];

    STUDENT(String name, int[] marks) {
        this.sName = name;
        this.marks = marks;
    }

    String extractInitials() {
        String[] nameParts = sName.split(" ");
        StringBuilder initials = new StringBuilder();
        for (String part : nameParts) {
            initials.append(part.charAt(0));
        }
        return initials.toString().toUpperCase();
    }

    String removeWhitespace() {
        return sName.replaceAll("\\s+", "");
    }

    void display() {
        System.out.println("Name: " + sName);
    }

    static void listNamesContainingSubstring(STUDENT[] students, String substring) {
        for (STUDENT student : students) {
            if (student.sName.contains(substring)) {
                student.display();
            }
        }
    }

    static void sortStudentsAlphabetically(STUDENT[] students) {
        Arrays.sort(students, (s1, s2) -> s1.sName.compareTo(s2.sName));
    }
}

public class L6q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        STUDENT[] students = new STUDENT[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter student name: ");
            String name = sc.nextLine();
            System.out.print("Enter number of subjects: ");
            int numSubjects = sc.nextInt();
            int[] marks = new int[numSubjects];
            System.out.println("Enter marks for " + numSubjects + " subjects:");
            for (int j = 0; j < numSubjects; j++) {
                marks[j] = sc.nextInt();
            }
            sc.nextLine();
            students[i] = new STUDENT(name, marks);
        }

        System.out.println("\n--- Student Details ---");
        for (STUDENT student : students) {
            student.display();
        }

        System.out.println("\nExtracted Initials for each student:");
        for (STUDENT student : students) {
            System.out.println(student.sName + " -> " + student.extractInitials());
        }

        System.out.println("\nNames with whitespace removed:");
        for (STUDENT student : students) {
            System.out.println(student.sName + " -> " + student.removeWhitespace());
        }

        System.out.print("\nEnter a substring to search for in student names: ");
        String substring = sc.nextLine();
        System.out.println("\nStudents with names containing \"" + substring + "\":");
        STUDENT.listNamesContainingSubstring(students, substring);

        STUDENT.sortStudentsAlphabetically(students);
        System.out.println("\nStudents sorted alphabetically:");
        for (STUDENT student : students) {
            student.display();
        }

        sc.close();
    }
}
