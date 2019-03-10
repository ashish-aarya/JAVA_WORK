package L11;

import java.util.Scanner;
import java.util.ArrayList;

public class Recursion_Coin_Toss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr = new Scanner(System.in);
		int n;
		System.out.println("Coin toss");
		n = scr.nextInt();
		ArrayList<String> arr = new ArrayList<>();
		arr = getCoinToss(n);
		
			System.out.println(arr);
	}

	public static ArrayList<String> getCoinToss(int n) {
		// TODO Auto-generated method stub

		if (n == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		ArrayList<String> rr=getCoinToss(n-1);
		ArrayList<String> mr = new ArrayList<>();
		for (String val:rr)
		{
			mr.add ("H"+val);
			mr.add ("V"+val);
		}
		return mr;
	}

}
