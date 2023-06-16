package Polymorphism;

public class MthdOvrlding {

	void add(int a, int b){
		System.out.println(a+b);
	}
	
	void add(double a, double b){
		System.out.println(a+b);
	}
	
	void add(int a, int b, int c) {
		System.out.println(a+b+c);
	}

	public static void main(String[] args) {
		MthdOvrlding obj = new MthdOvrlding();
		obj.add(12, 8);
		obj.add(12,8,5);
		obj.add(15.4, 14.6);
	}

}
