package arrayListEx;

import java.util.ArrayList;

public class ArayList {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();

		list.add("John");
		list.add("Paras");
		list.add("John Carter");
		list.remove(0);

		System.out.println(list);
		System.out.println(list.size());
		
		for(String s:list) {
			System.out.println(s);
		}
		for(Object obj:list) {
			System.out.println(obj);
		}
	}

}
