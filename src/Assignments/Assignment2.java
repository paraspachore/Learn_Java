package Assignments;

public class Assignment2 {

	public static void main(String[] args) {
		System.out.println("Multiplication Table 1 to 10");
		
		int i=1,j;
		while(i<=10) {
//			System.out.println("2*"+i+" = "+2*i);
			j=1;
			while(j<=10) {
				System.out.print("\t"+(i*j));
				j++;
			}
			System.out.print("\n");
			i++;
		}

	}

}
