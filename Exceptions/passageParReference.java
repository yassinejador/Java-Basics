public class passageParReference {
    public static void main(String[] args) {
        Point p = new Point(5, 5);
        System.out.println("Avant x: " + p.x);
        System.out.println("Avant y: " + p.y);
    }

    public static void change(Point p) {
        p = new Point(4, 8);
    }
}

class Point {
    public int x;
    public int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}