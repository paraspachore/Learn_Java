package basic_programs;

public class String_manupulation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String s = "Paras";
		String sa = "Heyy";
		
		s = sa.concat(" "+s);
		System.out.println(s);
		s = "   bhelcome  ";
		s = s.trim();
		System.out.println(s);
		System.out.println(s.charAt(7));
		System.out.println(s.contains("bhel"));
		s = "Paras";
		System.out.println(s.equals("Paras"));
		System.out.println(s.equalsIgnoreCase("pAras"));
		System.out.println(s.replace("r", "R"));
		s = "AbCdEfGhIj";
		System.out.println(s.substring(3, 5));
		System.out.println(s);
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println();
		
		
		String str = "Paras";
		System.out.println(str.charAt(0));
		str = "WELCOME";
		System.out.println(str.charAt(4));
		
		str = "Paras";
		String rev = "";
		for (int i = str.length()-1; i>=0; i--){
			rev += str.charAt(i);
		}
		System.out.println(rev);


		char c = 'r';
		for(int i=0; i<str.length(); i++){
			if(c==str.charAt(i)){
				System.out.print("character found in string at "+i);
				break;
			}
		}
	}

}