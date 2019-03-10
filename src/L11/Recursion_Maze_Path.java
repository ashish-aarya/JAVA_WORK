package L11;

import java.util.ArrayList;
import java.util.Scanner;

public class Recursion_Maze_Path {

	public static void main(String[] args) {
		// TODO Auto-generated method stubScanner scr = new Scanner(System.in);
		int n;
		Scanner scr = new Scanner(System.in);
		System.out.println("MAZE");
		// n = scr.nextInt();
		ArrayList<String> arr = new ArrayList<>();
		arr = getMazePath(0, 0, 2, 2);

		System.out.println(arr);
	}

	public static ArrayList<String> getMazePath(int cr, int cc, int er, int ec) {

		if (cr == er && cc == ec) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		ArrayList<String> mr = new ArrayList<>();

		if (cc <= ec) {
			ArrayList<String> rrh = getMazePath(cr, cc + 1, er, ec);
			for (String val : rrh)
				mr.add("H" + val);
		}

		if (cr <= er) {
			ArrayList<String> rrv = getMazePath(cr + 1, cc, er, ec);
			for (String val : rrv)
				mr.add("V" + val);
		}
		return mr;
	}

}
