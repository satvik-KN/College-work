class Building {
    double squareFootage;
    int stories;

    Building(double squareFootage, int stories) {
        this.squareFootage = squareFootage;
        this.stories = stories;
    }

    void displayDetails() {
        System.out.println("Square Footage: " + squareFootage);
        System.out.println("Stories: " + stories);
    }
}

class House extends Building {
    int bedrooms;
    int baths;

    House(double squareFootage, int stories, int bedrooms, int baths) {
        super(squareFootage, stories);
        this.bedrooms = bedrooms;
        this.baths = baths;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Bedrooms: " + bedrooms);
        System.out.println("Baths: " + baths);
    }
}

class School extends Building {
    int classrooms;
    String gradeLevel;

    School(double squareFootage, int stories, int classrooms, String gradeLevel) {
        super(squareFootage, stories);
        this.classrooms = classrooms;
        this.gradeLevel = gradeLevel;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Classrooms: " + classrooms);
        System.out.println("Grade Level: " + gradeLevel);
    }
}

public class L7q3 {
    public static void main(String[] args) {
        House house = new House(2500, 2, 4, 3);
        System.out.println("House Details:");
        house.displayDetails();

        System.out.println();

        School school = new School(10000, 3, 20, "Elementary");
        System.out.println("School Details:");
        school.displayDetails();
    }
}
