package problems;

import java.util.Scanner;

/*
 * Problem Statement
Given a string Str and a character C, your task is to remove the first and last occurrence of the
character C from the string Str.
Input Format
• First line of input consists of a string value, denoting str
• Second line of input consists of a character denoting C
Constraints
• 1 <= str.length <=100
Output Format
• Print the string after the above operation
 */
public class RemoveFirstNLastCharacter {
	
	static String removeOccurences(String str, char rm) {
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)==rm) {
				str = str.substring(0, i)+str.substring(i+1);
				break;
			}
		}
		for(int i=str.length()-1; i>=0; i--) {
			if(str.charAt(i)==rm) {
				str = str.substring(0, i)+str.substring(i+1);
				break;
			}
		}
		
		return str;
	}

	public static void main(String[] args) {
		String str = null;
		char c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		str = sc.nextLine();
		System.out.println("Enter String: ");
		c = sc.nextLine().charAt(0);
		sc.close();
		System.out.println("Str "+str+" Char: "+c);
		System.out.println(removeOccurences(str, c));
	}

}

/*
 * Output:
 * Enter String:
 * codeddecoded
 * Enter String:
 * e
 * Str codeddecoded Char: e
 * codddecodd
 * 
 */
