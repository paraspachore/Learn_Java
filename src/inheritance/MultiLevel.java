package inheritance;

class M1{
	int a;
	void dispM1() {
		System.out.println(a);
	}
}

class M2 extends M1{
	int b;
	void dispM2() {
		System.out.println(b);
	}
}

class M3 extends M2{
	int c;
	void dispM3() {
		System.out.println(c);
	}
}


public class MultiLevel {

	public static void main(String[] args) {
		
		M2 objM2 = new M2();
		objM2.a=10;
		objM2.b=20;
		objM2.dispM1();
		objM2.dispM2();
		
		M3 objM3 = new M3();
		objM3.a=100;
		objM3.b=200;
		objM3.c=300;
		objM3.dispM1();
		objM3.dispM2();
		objM3.dispM3();
		
	}

}
