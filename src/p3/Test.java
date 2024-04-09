package p3;

public class Test {
	public static void main(String [] args) {
		A a1 = new A();
		B a2 = new B();
		A a3 = new B();
		System.out.println(a1.method(a1));
		System.out.println(a1.method(a2));
		System.out.println(a1.method(a3));
		System.out.println(a2.method(a1));
		System.out.println(a2.method(a2));
		System.out.println(a2.method(a3));
		System.out.println(a3.method(a1));
		System.out.println(a3.method(a2));
		System.out.println(a3.method(a3));
		
	}

}


class A{
	int method(A a) {return 1;}
	int method(B a) {return 2;}
}

class B extends A{
//	int method(A a) {return 3;}
	int method(B a) {return 4;}
}