package Assignments;

public class Pyramids {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("----------------------------------------");

		for (int i = 0; i < 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("----------------------------------------");

		for (int i = 0; i < 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

		System.out.println("----------------------------------------");

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}

		System.out.println("----------------------------------------");

		for (int i = 0; i < 6; i++) {
			for (int k = (6 - i); k > 0; k--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= (i * 2); j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
