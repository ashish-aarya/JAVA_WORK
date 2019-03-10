package L11;

import java.util.ArrayList;
import java.util.Scanner;

public class Recursion_Maze_path_Skip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner scr = new Scanner(System.in);
		System.out.println("MAZE");
		// n = scr.nextInt();
		ArrayList<String> arr = new ArrayList<>();
		arr = getMazePathss(0, 0, 3, 3);

		System.out.println(arr);
	}

	public static ArrayList<String> getMazePathss(int cr, int cc, int er, int ec) {

		if (cr == er && cc == ec) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		ArrayList<String> mr = new ArrayList<>();

		if (cc <= ec) {
			for (int move=1;move<=ec-cc;move++){
			ArrayList<String> rrh = getMazePathss(cr, cc +move, er, ec);
			for (String val : rrh)
				mr.add("H" +move+ val);}
		}

		if (cr <= er) {
			for (int move=1;move<=er-cr;move++){
			ArrayList<String> rrv = getMazePathss(cr + move, cc, er, ec);
			for (String val : rrv)
				mr.add("V" + move+val);}
		}
		return mr;
	}

}
