package Assignments;

public class prblm4 {

	public static void main(String[] args) {
		System.out.println("Factors of given number");
		int num=12;
		for(int i=1; i<=num; i++) {
			if((num%i)==0){
				System.out.print(i+",");
			}
		}
	}

}
