package inheritance;

interface I{
	int a = 10; //It is by default declared as final and static
	void disp(); //It is an abstract method
}

class Inter implements I{
	public void disp() {
		System.out.println(a);
	}
}
public class InterfaceEx {

	public static void main(String[] args) {
		Inter obj = new Inter();
		obj.disp();
//		I obj = new Inter();
	}

}
