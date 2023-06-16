package methods;

public class Method4 {


	int sum(int a, int b) {
		int c = a + b;
		return c;
	}

	public static void main(String[] args) {

		Method4 obj = new Method4();

		int res = obj.sum(23,34);
		
		System.out.println(res);
	}

}
