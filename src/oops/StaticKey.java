package oops;

public class StaticKey {

	static int a = 10;
	int b = 20;

	static void m1() {
		System.out.println("this is a static method m1");
	}

	void m2() {
		System.out.println("this is a normal method m2");
	}
	
	void m3() {
		System.out.println("Inside m3 static a:"+a);
		System.out.println("Inside m3 non static"+b);
		System.out.println("This is inside m3(a non static method");
	}

	public static void main(String[] args) {

		StaticKey obj = new StaticKey();

		System.out.println(a);
		System.out.println(obj.b);
		
		m1();
		obj.m2();
		obj.m3();
	}

}
