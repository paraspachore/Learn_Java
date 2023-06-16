package methods;

public class Method3 {

	void sum(int a, int b) {
		int c = a + b;
		System.out.println(c);
	}

	public static void main(String[] args) {

		Method3 obj = new Method3();

		obj.sum(23,45);

	}
}
