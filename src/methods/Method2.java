package methods;

public class Method2 {
	int a = 2, b = 3, c;

	int disp() {
		c = a + b;
		return c;
	}

	public static void main(String[] args) {

		Method2 obj = new Method2();

		int res = obj.disp();
		
		System.out.println(res);

	}
}
