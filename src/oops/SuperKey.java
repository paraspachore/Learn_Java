package oops;

class Parent {
	String color = "White";

	void method() {
		System.out.println("This is a Parent class method");
	}
}

class Child extends Parent {
	String color = "Red";

	void disp() {
		System.out.println(color);
		System.out.println(super.color);
	}

	void method() {
		System.out.println("This is a Child class method");
		super.method();
	}
}

public class SuperKey {

	public static void main(String[] args) {
		Child objChild = new Child();
		objChild.disp();

		objChild.method();
	}

}
// Super keyword helps to access data from immediate parent class 