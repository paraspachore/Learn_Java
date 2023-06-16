package arrayListEx;

import java.util.*;

class Student {
	int id;
	String name;
	int marks;
	Student(int id, String name, int marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
}

class PrintList{
}

public class ArrList1 {
	static void printItems(ArrayList<Student> list) {
		int i=1;
		for(Student item:list) {
			item.id = i++;
			System.out.printf("%08d %-10s %d",item.id,item.name,item.marks);
			System.out.println();
		}
	}
	public static void main(String[] args) {
		
		ArrayList<Student> list = new ArrayList<Student>();
		
//		list.add("Aditya");
//		list.add("Bhajji");
//		list.add("BHai");
//		list.add("Bhaiyya");
//		list.add("Ajinkya");
		
		list.add(new Student(1, "Paras", 95));
		list.add(new Student(2, "Aditya", 97));
		list.add(new Student(3, "Ajinkya", 88));
		list.add(new Student(4, "Bhai", 93));
		list.add(new Student(5, "Bro", 99));
		System.out.println(list.size());
		
		list.remove(2);
		
		System.out.println(list.size());
		
//		PrintList obj = new PrintList();
		printItems(list);
		list.add(new Student(3, "Ajinkya", 88));
		printItems(list);
		
	}

}
