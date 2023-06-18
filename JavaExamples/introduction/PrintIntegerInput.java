package introduction;

import java.util.Scanner;

public class PrintIntegerInput {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.println("You Entered: "+n);
		
		sc.close();

	}

}
