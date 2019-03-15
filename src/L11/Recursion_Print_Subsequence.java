package L11;

import java.util.Scanner;

public class Recursion_Print_Subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter");
		Scanner scr=new Scanner (System.in);
		String sc=scr.next() ;
		printSS(sc,"");
	}

	public static void printSS(String qus, String ans) {
		if (qus.length() == 0) {
			System.out.println(ans);
			return;
		}
		char ch = qus.charAt(0);
		String req = qus.substring(1);
		printSS(req, ans);
		printSS(req, ans + ch);
	}

}
