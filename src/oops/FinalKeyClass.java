package oops;
/*final*/ class ParentClass{
	void run() {
		System.out.println("This is Parent class");
	}
}
class ChildClass extends ParentClass{
	void run() {
		System.out.println("This is Child class");
	}
}
public class FinalKeyClass {

	public static void main(String[] args) {
		
		ChildClass objC = new ChildClass();
		
		objC.run();

	}

}
