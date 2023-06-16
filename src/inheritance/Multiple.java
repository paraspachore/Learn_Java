package inheritance;

interface AB {
	int a = 10;
	void disp();
}

interface CD {
	int b = 20;
	void dispb();
}

public class Multiple implements AB, CD {

	public void disp() {
		System.out.println(a);
	}

	public void dispb() {
		System.out.println(b);
	}

	public static void main(String[] args) {

		Multiple obj = new Multiple();

		obj.disp();
		obj.dispb();

	}
}
