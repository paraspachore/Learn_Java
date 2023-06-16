package exceptionHandling;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		int a = 50;
		
		try {
			System.out.println(a/0);
		}
		catch(ArithmeticException e) {
			System.out.println("enter into exception");
		}
		System.out.println("After Exception");
	}

}
