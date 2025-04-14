interface Sports {
    void putSportsScore(int score);
}

class Student {
    private int rollNum;
    private int marks;

    public void putRollNum(int rollNum) {
        this.rollNum = rollNum;
    }

    public void getRollNum() {
        System.out.println("Roll Number: " + rollNum);
    }

    public void putMarks(int marks) {
        this.marks = marks;
    }

    public void getMarks() {
        System.out.println("Marks: " + marks);
    }
}

class Result extends Student implements Sports {
    private int sportsScore;

    @Override
    public void putSportsScore(int score) {
        this.sportsScore = score;
    }

    public void displayResult() {
        getRollNum();
        getMarks();
        System.out.println("Sports Score: " + sportsScore);
        System.out.println("Total Score: " + (marks + sportsScore));
    }
}

public class L8q3 {
    public static void main(String[] args) {
        Result studentResult = new Result();
        studentResult.putRollNum(101);
        studentResult.putMarks(85);
        studentResult.putSportsScore(10);

        studentResult.displayResult();
    }
}
