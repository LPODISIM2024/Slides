package it.disim.hello.studente.palma;

public class Swap {
    public static void swap(Point p1, Point p2) {
        int x = p1.x;
        int y = p1.y;
        p1.x = p2.x;
        p1.y = p2.y;
        p2.x = x;
        p2.y = y;
    }
    
    public static void main (String[] args) {
    	Point p = new Point(5,10);
    	Point p1 = new Point(15,20);
    	System.out.println(p + " x=" + p.x);
    	System.out.println(p1 + " x=" + p1.x);
    	swap(p, p1);
    	System.out.println(p + " x=" + p.x);
    	System.out.println(p1 + " x=" + p1.x);
    	
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