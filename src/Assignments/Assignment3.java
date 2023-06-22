package assignments;

public class Assignment3 {

	public static void main(String[] args) {
//		Fibonacci series
		int n1=0,n2=1,n3;
		
		for(int i=0; i<=20; i++) {
			n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
		}
//		Second method
		int num1=0,num2=1,num3;
		System.out.println("Fibonacci series upto 100 using while loop");
		while(num1<100) {
			System.out.println(num1);
			num3=num1+num2;
			num1=num2;
			num2=num3;
		}
	}

}
