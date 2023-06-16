package problems;

public class ReverseString {

	static String revMethod1(String str) {
		
		StringBuilder tmpStr = new StringBuilder();
		tmpStr.append(str);
		tmpStr.reverse();
		return String.valueOf(tmpStr);
		
	}
	
	static String revMethod2(String str) {
		return new StringBuilder(str).reverse().toString();
	}

	public static void main(String[] args) {

		String str = "ParasPachore";

		str = revMethod1(str);

		System.out.println(str);
		
		str = revMethod2(str);
		
		System.out.println(str);
		
//		Method 3
		System.out.println(new StringBuilder(str).reverse().toString());

	}

}
