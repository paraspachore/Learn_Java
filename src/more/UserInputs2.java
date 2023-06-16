package more;

import java.util.Scanner;

public class UserInputs2 {

	public static void main(String[] args) {
		
		String country;
		int population;
		float populationDensity;
		double GDP;
		char currency;
		boolean isSecular;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your country name: ");
		country = sc.nextLine();
		System.out.println("Enter Population: ");
		population = sc.nextInt();
		System.out.println("Enter Population Density: ");
		populationDensity = sc.nextFloat();
		System.out.println("Enter GDP: ");
		GDP = sc.nextDouble();
		System.out.println("Enter Currency symbol: ");
		currency = sc.next().charAt(0);//---------------------------------character input
		System.out.println("Enter Secularity true/false: ");
		isSecular = sc.nextBoolean();
		sc.close();
		
		
		System.out.println("Country: "+country);
		System.out.println("Population: "+population);
		System.out.println("Population Density: "+populationDensity);
		System.out.println("GDP: "+GDP);
		System.out.println("Currency: "+currency);
		System.out.println("Secular: "+isSecular);
		
	}

}
