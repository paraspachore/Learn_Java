package basic_programs;

public class Matrix {

	public static void main(String[] args) {

		int a[][] = { { 2, 3, 4, 5 }, { 5, 6, 2, 4 }, { 1, 2, 3, 2 }, { 3, 4, 6, 2 } };
		int b[][] = { { 3, 2, 1, 7 }, { 1, 2, 3, 4 }, { 3, 2, 1, 2 }, { 4, 4, 3, 4 } };
		int c[][] = new int[a.length][a[0].length];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print((c[i][j] = a[i][j] + b[i][j]) + " ");
			}
			System.out.println();
		}

		System.out.println("-----------------------------------------------");

		for (int row[] : c) {
			for (int col : row) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
	}

}
