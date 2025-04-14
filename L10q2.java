class CourseFullException extends Exception {
    public CourseFullException(String message) {
        super(message);
    }
}

class Course {
    private String courseName;
    private int capacity;
    private int enrolledStudents;

    public Course(String courseName, int capacity) {
        this.courseName = courseName;
        this.capacity = capacity;
        this.enrolledStudents = 0;
    }

    public void enrollStudent() throws CourseFullException {
        if (enrolledStudents >= capacity) {
            throw new CourseFullException("The course " + courseName + " is already full.");
        }
        enrolledStudents++;
        System.out.println("Student enrolled in " + courseName + ". Total enrolled students: " + enrolledStudents);
    }
}

public class L10q2 {
    public static void main(String[] args) {
        Course course = new Course("Java Programming", 2);

        // Enroll students
        try {
            course.enrollStudent();
            course.enrollStudent();
            course.enrollStudent();  // This will throw CourseFullException
        } catch (CourseFullException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
