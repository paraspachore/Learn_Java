package basic_programs;

public class operators {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
/*		Operators in java
		1. Arithmetic Operators in Java
		2. Relational Operators
		3. Logical Operators
		4. Increment/decrement Operators
*/		
		int a = 10;
		int b = 5;
		
		System.out.println("1. Arithmetic Operators:");
		System.out.println("Sum of a and b \t\t\t= "+(a+b));
		System.out.println("Substraction of a and b \t= "+(a-b));
		System.out.println("Product of a and b \t\t= "+(a*b));
		System.out.println("Division of a and b \t\t= "+(a/b));
		System.out.println("Mod or remainder of a and b \t= "+(a%b));
		
		System.out.println("\n\n2. Relational Operators:");
		System.out.println("A is greater than B :\t\t\t= "+(a>b));
		System.out.println("A is greater than equal to B :\t\t= "+(a>=b));
		System.out.println("A is less than B :\t\t\t= "+(a<b));
		System.out.println("A is less than equal to B :\t\t= "+(a<=b));
		System.out.println("A is equal to B :\t\t\t= "+(a==b));
		
		System.out.println("\n\n3. Logical Operators:");
		System.out.println("Logical AND T && F \t="+(true && false));
		System.out.println("Logical AND T && T \t="+(true && true));
		System.out.println("Logical AND F && F \t="+(false && false));
		System.out.println("Logical OR T || T \t="+(true || true));
		System.out.println("Logical OR T || F \t="+(true || false));
		System.out.println("Logical OR F || F \t="+(false || false));
		System.out.println("Logical NOT !T \t\t="+(!true));
		System.out.println("Logical NOT !F \t\t="+(!false));

		System.out.println("\n\n4. Increment OR decrement Operators:");
		System.out.println("Pre-Increment operator:a="+a+", ++a="+(++a));
		System.out.println("Post-Increment operator:b="+b+", b++="+(b++));
		System.out.println("after Post-Increment operator b="+b);
		System.out.println("Pre-Decrement operator:a="+a+", --a="+(--a));
		System.out.println("Post-Decrement operator:b="+b+", b--="+(b--));
		System.out.println("after Post-Decrement operator b="+b);
		
		System.out.println("\n\n4. Assignment Operator:");
		System.out.println("Sum of a and b : a="+a+", b="+b+" then used a=b : a="+(a=b));
	}

}
