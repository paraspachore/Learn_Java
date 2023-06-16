package problems;

import java.util.Scanner;

public class SumNaturalNums {
	public static void main(String[] args) {
		Source source = new Source();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = source.calculateSum(n);
		System.out.println(sum);
		sc.close();
	}
}

class Source {
	public int calculateSum(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}
		return sum;
	}
}
