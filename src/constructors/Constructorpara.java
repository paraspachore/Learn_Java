package constructors;

public class Constructorpara {

	int a;
	int b;
	Constructorpara(int x, int y){
		a = x;
		b = y;
	}
	
	void display(){
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		Constructorpara obj = new Constructorpara(11,22);
		obj.display();
	}

}
