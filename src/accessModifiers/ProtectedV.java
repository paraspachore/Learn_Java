package accessModifiers;
class AAA{
	int a =10;
	void m1() {
		System.out.println(a);
	}
	void m2() {
		System.out.println(a*2);
	}
}
public class ProtectedV {

	public static void main(String[] args) {
		
		AAA obj = new AAA();
		obj.a=20;
		obj.m1();
		obj.m2();
		
	}

}
//Protected - Variables and methods are accessible inside and outside of the package but only through instance		obj.a=20;