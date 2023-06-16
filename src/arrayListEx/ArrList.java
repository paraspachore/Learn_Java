package arrayListEx;

import java.util.ArrayList;

public class ArrList {

	public static void main(String[] args) {
		
		ArrayList<Object> list = new ArrayList<Object>();
		
		list.add("Paras");
		list.add(23);
		list.add(23.4);
		list.add(true);
		
		System.out.println(list);
		
		for(Object j:list) {
			System.out.println(j);
		}

	}

}
