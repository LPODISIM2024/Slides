package slides;

public class Swap {
    public static void swap(Point p1, Point p2) {
        int x = p1.x;
        int y = p1.y;
        p1.x = p2.x;
        p1.y = p2.y;
        p2.x = x;
        p2.y = y;
    }

    public static void main(String[] args) {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);
        swap(p1, p2);
        System.out.println(p1.x + " " + p1.y);
        System.out.println(p2.x + " " + p2.y);

        int a = 10;
        int x, y;
        x = y = a;
        System.out.println(x);
        System.out.println(y);

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
