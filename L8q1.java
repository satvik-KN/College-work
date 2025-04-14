abstract class Figure {
    int x, y;

    Figure(int x, int y) {
        this.x = x;
        this.y = y;
    }

    abstract void area();
}

class Rectangle extends Figure {

    Rectangle(int x, int y) {
        super(x, y);
    }

    @Override
    void area() {
        System.out.println("Area of Rectangle: " + (x * y));
    }
}

class Triangle extends Figure {

    Triangle(int x, int y) {
        super(x, y);
    }

    @Override
    void area() {
        System.out.println("Area of Triangle: " + (0.5 * x * y));
    }
}

class Square extends Figure {

    Square(int x) {
        super(x, x);
    }

    @Override
    void area() {
        System.out.println("Area of Square: " + (x * x));
    }
}

public class L8q1 {
    public static void main(String[] args) {
        Figure figure1 = new Rectangle(5, 10);
        Figure figure2 = new Triangle(5, 10);
        Figure figure3 = new Square(4);

        figure1.area();
        figure2.area();
        figure3.area();
    }
}
