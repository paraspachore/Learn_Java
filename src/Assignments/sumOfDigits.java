package assignments;

public class sumOfDigits {

	public static void main(String[] args) {
		 
		int n = 643, sum = 0;
		while(n>0) {
			sum += (n%10);
			n /= 10;
		}
		System.out.println(sum);
	}

}
