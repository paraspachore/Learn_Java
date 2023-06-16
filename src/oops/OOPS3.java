package oops;

public class OOPS3 {

	int id, marks;
	String name;

	void getData() {
		id = 1001;
		name = "stdnm";
		marks = 99;
	}

	void disp() {
		System.out.printf("id = %d, \nname = %s, \nmarks = %d", id, name, marks);
	}

	public static void main(String[] args) {
		OOPS3 obj = new OOPS3();

		obj.getData();
		obj.disp();
	}

}
