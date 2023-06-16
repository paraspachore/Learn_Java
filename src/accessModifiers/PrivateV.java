package accessModifiers;

class A{
	private int a =10;
	void m1() {
		System.out.println(a);
	}
	@SuppressWarnings("unused")//this line is to hide warning of not used
	private void m2() {
		System.out.println(a*2);
	}
}
public class PrivateV {
	public static void main(String[] args) {
		
		A obj = new A();
		//obj.a=20;
		obj.m1();
//		obj.m2();

	}

}
//Uncomment line 13 & 18 to see the expected result