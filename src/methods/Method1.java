package methods;

public class Method1 {

	int a=2,b=3,c;
	
	void disp() {
		c=a+b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		
		Method1 obj = new Method1();
		
		obj.disp();

	}

}
