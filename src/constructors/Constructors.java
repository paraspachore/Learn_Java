package constructors;

public class Constructors {

	int a;
	Constructors(){
		a = 10;
	}
	void display() {
		System.out.println(a);
	}
	public static void main(String[] args) {
		Constructors obj = new Constructors();
		obj.display();
	}

}
