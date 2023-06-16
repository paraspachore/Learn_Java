package inheritance;

class A{
	int x;
	
	void dispa() {
		System.out.println(x);
	}
}

class B extends A {
	int y;
	void dispb() {
		System.out.println(y);
	}
}

public class Single {
	public static void main(String[] args) {
		
		A obja = new A();
		obja.x = 10;
		obja.dispa();
		
		B objb = new B();
		objb.y = 20;
		objb.dispb();
		objb.x=30;
		objb.dispa();

	}

}
