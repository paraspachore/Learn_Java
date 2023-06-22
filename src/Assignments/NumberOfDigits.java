package assignments;

public class NumberOfDigits {

	public static void main(String[] args) {
		
		int number = 0;
		int count=0;
		if(number<0) {
			number -= number*2;
		}
		while(number>0) {
			count++;
			if(number==0) {
				break;
			}
			number/=10;
		}
		System.out.println("Number of digits: "+count);
	}

}
