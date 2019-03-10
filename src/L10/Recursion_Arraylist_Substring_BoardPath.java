package L10;

import java.util.ArrayList;

public class Recursion_Arraylist_Substring_BoardPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getBoardPath(0, 10));
	}

	public static ArrayList<String> getBoardPath(int curr, int end) {
		if (curr == end) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}

		ArrayList<String> mr = new ArrayList<>();
		for (int dice = 1; dice <= 6 && curr + dice <= end; dice++) {
			ArrayList<String> rr = getBoardPath(curr + dice, end);
			
			for (String val : rr)
				mr.add(dice + val);
		}
		return mr;
	}
}
