package oops;

public class OOPS2 {

	int a = 3, b = 4, c;

	void add() {
		c = a + b;
	}

	void disp() {
		System.out.println("Sum = " + c);
	}

	public static void main(String[] args) {
		OOPS2 obj = new OOPS2();
		obj.disp();
		obj.add();
		obj.disp();
	}

}
