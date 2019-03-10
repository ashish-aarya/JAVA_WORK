package L8;

import java.util.Scanner;

public class odd_even_strbuld {
	public static Scanner scr = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter");
		String scn = scr.next();
		//System.out.println(scn);
		//System.out.println(odd_even(scn));
		System.out.println(odd_even(scn));
		//System.out.println(scn);

	}

	public static String odd_even(String S) {
		StringBuilder sb = new StringBuilder(S);
		StringBuilder ans = new StringBuilder();
		char ch;
		for (int i = 0; i < sb.length(); i++) {
			if (i % 2 == 0) {
				int n= (int)(sb.charAt(i));
				
				ch = (char)(++n);
				ans.append(ch);
			
			} else {
				int n= (int)sb.charAt(i);
				ch = (char)(--n);
				 ans.append(ch);
				
			}
		}
		return ans.toString();
	}

}
