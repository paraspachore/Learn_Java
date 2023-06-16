package problems;

public class SwapwithoutThirdV {

	public static void main(String[] args) {
		
		int a = 10, b = 20;
//		int c;
		
//		c = a;
//		a = b;
//		b = c;
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println(a);
		System.out.println(b);

	}

}
