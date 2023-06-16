package Assignments;

public class prblm3 {

	public static void main(String[] args) {
		System.out.println("Number of digits");
		int num=23454, count=0;
		int n=num;
		if(n<0) {
			n-=2*n;
		}
		do {
			n/=10;
			count++;
		} while(n>0);
		System.out.printf("%d is a %d digit number",num,count);
	}

}
