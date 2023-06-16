package accessModifiers;

class AA{
	int a =10;
	void m1() {
		System.out.println(a);
	}
	void m2() {
		System.out.println(a*2);
	}
}
public class DefaultV {
	public static void main(String[] args) {
		
		AA obj = new AA();
		obj.a=20;
		obj.m1();
		obj.m2();

	}

}
// here Variables and methods will be accessible though out the package 