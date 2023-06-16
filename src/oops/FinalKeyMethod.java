package oops;

class Bike {
	/*final*/ void run() {
		System.out.println("Running");
	}
}

class Honda extends Bike {
	void run() {
		System.out.println("Honda Running");
	}
}

public class FinalKeyMethod {

	public static void main(String[] args) {
		Honda objH = new Honda();

		objH.run();
	}

}
// Uncomment "final" keyword to see the result of final keyword