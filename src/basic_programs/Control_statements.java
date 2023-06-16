package basic_programs;

public class Control_statements {

	public static void main(String[] args) {
		/*
		 * Java Control Statements 1. Conditional Control/Selection 2. Loop
		 * Control/Iterative 3. Jump Control
		 */
		
		
		System.out.println("1. Conditional Control:");
		int age = 20;
		System.out.println("age:" + age);
		if (age >= 18) {
			System.out.println("Elegible for Voting");
		} else {
			System.out.println("Not Elegible for Voting");
		}
//		checkage(age);
		age = 15;
		System.out.println("age:" + age);
		if (age >= 18) {
			System.out.println("Elegible for Voting");
		} else {
			System.out.println("Not Elegible for Voting");
		}
//		checkage(age);

		
		
		System.out.println("-----------------------------");
		int a = 10;
		int b = 20;
		System.out.println("a=" + a + "b=" + b);
		if (a > b) {
			System.out.println("A is greater");
		} else {
			System.out.println("B is greater");
		}
//		Largest(a, b);
		a = 40;
		System.out.println("a=" + a + "b=" + b);
		if (a > b) {
			System.out.println("A is greater");
		} else {
			System.out.println("B is greater");
		}
//		Largest(a, b);

		System.out.println("\nChecking whether number is divisible by 3:");
		int x = 60;
		if (x % 3 == 0) {
			System.out.println("Yes " + x + " is divisible");
		}

		System.out.println("\nChecking whether number is even or odd:");
		int Num = 16;
		if ((Num % 2) == 0) {
			System.out.println("It's an Even Number");
		} else {
			System.out.println("It's an Odd Number");
		}
//		checkEven(Num);

		// Checking weekdays

		System.out.println("\nChecking weekdays using if else");
		int weekday = 7;

		if (weekday == 1) {
			System.out.println("Monday");
		} else if (weekday == 2) {
			System.out.println("Tuesday");
		} else if (weekday == 3) {
			System.out.println("Wednesday");
		} else if (weekday == 4) {
			System.out.println("Thursday");
		} else if (weekday == 5) {
			System.out.println("Friday");
		} else if (weekday == 6) {
			System.out.println("Saturday");
		} else if (weekday == 7) {
			System.out.println("Sunday");
		} else {
			System.out.println("Invalid Input");
		}

		System.out.println("\nNumber to Text using if else");
		int num = 8;

		if (num == 1) {
			System.out.println("One");
		} else if (num == 2) {
			System.out.println("Two");
		} else if (num == 3) {
			System.out.println("Three");
		} else if (num == 4) {
			System.out.println("Four");
		} else if (num == 5) {
			System.out.println("Five");
		} else if (num == 6) {
			System.out.println("Six");
		} else if (num == 7) {
			System.out.println("Seven");
		} else if (num == 8) {
			System.out.println("Eight");
		} else if (num == 9) {
			System.out.println("Nine");
		} else if (num == 10) {
			System.out.println("Ten");
		}

		System.out.println("\nNumber to Text using switch case");
		int choice = 2;

		switch (choice) {
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		case 5:
			System.out.println("Five");
			break;
		case 6:
			System.out.println("Six");
			break;
		case 7:
			System.out.println("Seven");
			break;
		case 8:
			System.out.println("Eight");
			break;
		case 9:
			System.out.println("Nine");
			break;
		case 10:
			System.out.println("Ten");
			break;
		default:
			System.out.println("Invalid Choice");
		}

		// Loop control
		//While loop
		System.out.println("\nWhile loop");
		int i = 0;
		while (i < 10) {
			System.out.println(++i);
		}
		System.out.println("\nWhile loop");
		i = 1;
		while (i <= 10) {
			System.out.println(++i);
		}
		
		System.out.println("\n10 to 1 using While loop");
		i = 10;
		while (i >= 1) {
			System.out.println(i--);
		}
		
		System.out.println("\nSum of numbers using While loop");
		int n = 1;
		int sum = 0;
		while (n <= 10) {
			sum += n;
			System.out.println(n++);
		}
		System.out.println("Sum of above nums: " + sum);
		
//		Do while loop

		System.out.println("\n10 to 1 using Do While loop");
		i = 10;
		do {
			System.out.println(i--);
		} while (i >= 1);
		
		System.out.println("\nSum of numbers using Do While loop");
		n = 1;
		sum = 0;
		do {
			sum += n;
			System.out.println(n++);
		} while (n <= 10);
		System.out.println("Sum of above nums: " + sum);
		
//		for loop
		
		System.out.println("\nEven numbers using for loop");
		for (i=0; i<=50; i+=2) {
			System.out.println(i);
		}
		
//		Jump/break statement in loop
		System.out.println("\nbreak statement in loop");
		for (i=0; i<=10; i++) {
			if(i==6) {
				break;
			}
			System.out.println(i);
		}
//		Continue statement in loop
		System.out.println("\ncontinue statement in loop");
		for (i=0; i<=10; i++) {
			if(i==6||i==3) {
				continue;
			}
			System.out.println(i);
		}
		
//		check whether number is positive or negative
		System.out.println("\ncheck whether number is positive or negative");
		num=2;
		if(num>=0) {
			System.out.printf("%d is positive",num);
		}
		else {
			System.out.println("number is negative");
		}
	}

	// ----------------------------------------------------------------------------------------------------------------------
//
//	static void checkage(int age) {
//		if (age >= 18) {
//			System.out.println("Elegible for Voting");
//		} else {
//			System.out.println("Not Elegible for Voting");
//		}
//	}
//
//	static void Largest(int a, int b) {
//		if (a > b) {
//			System.out.println("A is greater");
//		} else {
//			System.out.println("B is greater");
//		}
//	}
//
//	static void checkEven(int n) {
//		if ((n % 2) == 0) {
//			System.out.println("It's an Even Number");
//		} else {
//			System.out.println("It's an Odd Number");
//		}
//	}
}
