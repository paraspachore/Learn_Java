package problems;

public class ReplaceSubStringIntoString {

	public static void main(String[] args) {
		String str = "abcdefgh";
		int replacingIndex = 4;
		String subStr = "PQR";
		
		char[] strc = str.toCharArray();
		char[] subStrc = subStr.toCharArray();
		
		for(int i=0; i<subStr.length();i++) {
			strc[replacingIndex]=subStrc[i];
			replacingIndex++;
		}
		
		strc.toString();
		System.out.println(strc);
		
		//another method
//		str = str.substring(0, replacingIndex)+ subStr + str.substring(replacingIndex+subStr.length());
//		System.out.println(str);
				
	}

}
