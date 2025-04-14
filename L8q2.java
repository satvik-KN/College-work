interface Series {
    int getNext();
    void reset();
    void setStart(int start);
}

class ByTwos implements Series {
    private int start;
    private int current;

    @Override
    public void setStart(int start) {
        this.start = start;
        this.current = start;
    }

    @Override
    public int getNext() {
        current += 2;
        return current;
    }

    @Override
    public void reset() {
        current = start;
    }
}

public class L8q2 {
    public static void main(String[] args) {
        Series series = new ByTwos();
        series.setStart(0);

        System.out.println("Series starting at 0:");
        System.out.println(series.getNext());
        System.out.println(series.getNext());
        System.out.println(series.getNext());

        series.reset();
        System.out.println("After reset:");
        System.out.println(series.getNext());
    }
}

