package slides;

public class Slide5_13 {

	public static void main(String[] args) {
		Point3D p = new Point3D();
		p.move("10", "20", 30);
		System.out.println("x=" + p.getX() + ", y=" + p.getY());
		System.out.println("x=" + p.x + ", y=" + p.y);
	}
}

class Punto4_13 {
	protected int x, y;

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
}

class Point3D extends Punto4_13 {
	protected String x, y;
	protected float z;

	public void move(String dx, String dy, int dz) {
		x = dx;
		y = dy;
		z = dz;
	}
}
