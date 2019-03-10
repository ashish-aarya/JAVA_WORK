package L10;

import java.util.ArrayList;

public class Recursion_Arraylist_Substring_Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getPermutation("abc"));
	}

	public static ArrayList<String> getPermutation(String str) {
		if (str.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		char ch = str.charAt(0);
		String ros = str.substring(1);
		ArrayList<String> rr = getPermutation(ros);
		ArrayList<String> mr = new ArrayList<>();
		for (String val : rr) {

			for (int i = 0; i <= val.length(); i++) {

				String ans = val.substring(0, i) + ch + val.substring(i);
				mr.add(ans);
			}
			
		
		}
		return mr;

	}
}