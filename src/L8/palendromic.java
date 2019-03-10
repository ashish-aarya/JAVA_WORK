package L8;

import java.util.Scanner;

public class palendromic {
	public static Scanner scr = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("BLOCK");
		String scn = scr.next();
		substring(scn);
	}

	public static void substring(String S) {
		int n = S.length();
		for (int i = 0; i <= n; i++) {
			for (int j = i; j < n; j++) {
				String s = S.substring(i, j + 1);
				if (palend(s))
					System.out.println(s);
			}
			System.out.println("");
		}
	}

	public static boolean palend(String sc) {
		int lt = 0, rt = sc.length() - 1;
		while (lt < rt)

		{
			if (sc.charAt(lt) != sc.charAt(rt))
				return false;
			lt++;
			rt--;
		}
		return true;
	}

}
