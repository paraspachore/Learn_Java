package Polymorphism;

public class Add {
	Add(int a, int b){
		System.out.println(a+b);
	}
	Add(int a, int b, int c){
		System.out.println(a+b+c);
	}
	Add(double a, double b){
		System.out.println(a+b);
	}
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Add obj1 = new Add(13,32);
		Add obj2 = new Add(12, 20, 30);
		Add obj3 = new Add(23,17.2);
		
	}

}
