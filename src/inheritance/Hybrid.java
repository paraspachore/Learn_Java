package inheritance;

class AAA {
	void m1() {
		System.out.println("This is class AAA");
	}
}

interface BBB {
	void m2();
}

interface CCC {
	void m3();
}

public class Hybrid extends AAA implements BBB, CCC {

	public void m2() {
		System.out.println("This is from BBB");
	}

	public void m3() {
		System.out.println("This is from CCC");
	}

	public static void main(String[] args) {

		Hybrid obj = new Hybrid();
		obj.m1();
		obj.m2();
		obj.m3();

	}

}
