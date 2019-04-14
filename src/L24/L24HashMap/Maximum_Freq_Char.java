package L24.L24HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Maximum_Freq_Char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		// String str = scn.next();

		System.out.println(MaxFreq("aaabbbbbbbbc"));
		int one[] = { 10, 20, 40, 10, 30, 10, 60 };
		int[] two = { 60, 40, 10, 80, 10, 90, 40 };
		ArrayList<Integer> rl = intersection(one, two);
		// for (int val:rl)
		System.out.println(rl);
		int ar[] = { 2, 12, 9, 16, 10, 5, 3, 20, 25, 11, 1, 8, 6, 4 };
		System.out.println(longestConsecutiveSeq(ar));
	}

	public static char MaxFreq(String str) {

		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			if (map.containsKey(str.charAt(i))) {
				int gt = map.get(str.charAt(i));
				map.put(str.charAt(i), gt + 1);
			} else {
				map.put(str.charAt(i), 1);
			}
		}
		char c = ' ';
		int max = -1;
		Set<Character> keys = map.keySet();
		for (char key : keys) {
			if (max < map.get(key)) {
				max = map.get(key);
				c = key;
			}
		}
		return c;

	}

	public static ArrayList<Integer> intersection(int[] one, int[] two) {
		ArrayList<Integer> ans = new ArrayList<>();
		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < one.length; i++) {
			if (map.containsKey(one[i])) {
				int gt = map.get(one[i]);
				map.put(one[i], gt + 1);
			} else {
				map.put(one[i], 1);
			}

		}
		for (int i = 0; i < two.length; i++) {
			if (map.containsKey(two[i])) {
				ans.add(two[i]);
				map.put(two[i], map.get(two[i]) - 1);
				if (map.get(two[i]) == 0) {
					map.remove(two[i]);
				}
			}

		}
		return ans;
	}

	public static ArrayList<Integer> longestConsecutiveSeq(int[] arr) {
		HashMap<Integer, Boolean> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			int val = arr[i];
			if (map.containsKey(val - 1)) {
				map.put(val, false);

			} else {
				map.put(val, true);
			}
			if (map.containsKey(val + 1))
				map.put(val + 1, false);
		}
		int maxc = 0;
		int st = 0;
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			int chk = arr[i];
			if (map.get(chk)) {
				st = chk;
				maxc = 0;

				while (map.containsKey(st + count)) {
					count++;

				}
				if (maxc < count) {
					maxc = count;
					st = arr[i];
				}
			}
		}
		ArrayList<Integer> rs = new ArrayList<>();
		for (int i = st; i <= st + maxc; i++)
			rs.add(i);
		return rs;
	}

}
