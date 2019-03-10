package L8;

import java.util.Scanner;

public class Reversenumb_string {
	public static Scanner scr = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter");
		String scn = scr.next();
		reverse(scn);
	}

	public static void reverse(String sc) {
		String s = "";
		String ans = "";
		for (int i = sc.length() - 1; i >= 0; i--) {
			if (sc.charAt(i) == '+' || sc.charAt(i) == '-' || sc.charAt(i) == '*' || sc.charAt(i) == '/'
					|| sc.charAt(i) == '%') {
				ans += s + sc.charAt(i);
				s = "";
			} else {
				
				s =  sc.charAt(i)+s;
			}
		}
		
		ans += s;
		System.out.println(ans);
	}

}
