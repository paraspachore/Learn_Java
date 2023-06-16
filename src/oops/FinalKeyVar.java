package oops;

class Final {
	int a = 10;
//	final int a = 10;
}

public class FinalKeyVar {
	public static void main(String[] args) {

		Final obj = new Final();

		obj.a = 20;

		System.out.println(obj.a);

	}
}
// Uncomment line 5 and comment line 4 to see the result of final keyword