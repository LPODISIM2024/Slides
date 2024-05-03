package p11;

enum MiaEnumerazione3 {
    UNO(100), DUE(2), TRE(3);
    private int valore;
    private MiaEnumerazione3() {
    }
    MiaEnumerazione3(int valore) {
      setValore(valore);
    }
    public void setValore(int valore){this.valore = valore;}
    public int getValore(){return this.valore;}

    @Override
    public String toString() {
      return "" + valore;
    }
}

public class Enumeration {
	public static void main (String[] args) {
		System.out.println(MiaEnumerazione3.UNO.getValore());
	}
}
