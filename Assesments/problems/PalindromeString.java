package problems;

public class PalindromeString {
	public static void main(String[] args) {
		String str = "dadad";
		String rev = "";
		for(int i = str.length()-1; i>=0; i--) {
			rev += str.charAt(i);
		}
		
		if(str.equals(rev)) {
			System.out.println(str+" is Palindrome");
		} else {
			System.out.println(str+" is not Palindrome");
		}
	}
}
