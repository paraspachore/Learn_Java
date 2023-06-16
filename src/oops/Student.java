package oops;

public class Student {

	int id;
	String name;
	int deptNo = 101;

	void setData(int id, String name) {
		this.id = id;
		this.name = name;
	}

	void getData() {
		System.out.println();
		System.out.println("Roll No. " + id);
		System.out.println("Name: " + name);
		System.out.println("Department No. " + deptNo);
	}

	public static void main(String[] args) {

		Student obj = new Student();
		obj.setData(1, "Paras");
		obj.getData();

		Student obj2 = new Student();
		obj2.setData(2, "Aditya");
		obj2.getData();

		Student obj3 = new Student();
		obj3.setData(3, "Ajinkya");
		obj3.getData();

	}

}
