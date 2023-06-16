package more;

import java.util.Scanner;

public class UserInputs {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		String name = sc.next();
		sc.nextLine();
		System.out.print("Enter your full name: ");
		String fullName = sc.nextLine();
		System.out.println(name);
		System.out.println(fullName);
		
		sc.close();
	}

}
