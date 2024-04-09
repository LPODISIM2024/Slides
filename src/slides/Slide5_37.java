package slides;

public class Slide5_37 {
	public static void main(String[] args) {
		ColoredPoint cp = new ColoredPoint();
		byte color = 37;
		cp.setColor(color);
		cp.setColor(37); //Errore in compilazione
	}
}

class ColoredPoint {
	int x, y;
	byte color;
	void setColor(byte color) { this.color = color; }
}

