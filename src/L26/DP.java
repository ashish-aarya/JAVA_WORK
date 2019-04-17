package L26;

import java.util.Arrays;

public class DP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		// System.out.println(fibonacciTD(n, new int[n + 1]));
		// System.out.println(fibonacciDU(n));
		// System.out.println(fibonacciDUSE(n));
		// System.out.println(boardPathTD(0, n, new int[n]));
		// System.out.println(boardPathDU(n, n, new int[n + 1]));
		// System.out.println(boardPathBU(n));
		// System.out.println(boardPathDUSE(n));
		// System.out.println(mazePathTD(0, 0, n, n, new int[n + 1][n + 2]));
		// System.out.println(mazePathBU(n, n));
		// System.out.println(mazePathBUSE(n, n));
		String s1 = "SAT";
		String s2 = "SUN";
		// System.out.println(LCS(s1, s2));
		// System.out.println(LCSTB(s1, s2, new int[s1.length() + 1][s2.length()
		// + 1]));
		// System.out.println(LCSBU(s1, s2));
		System.out.println(EditDistance(s1, s2));
		System.out.println(EditDistanceBU(s1, s2));
	}

	public static int fibonacciTD(int n, int[] strg) {
		if (n == 0 || n == 1)
			return n;
		if (strg[n] != 0)
			return strg[n];
		int fb1 = fibonacciTD(n - 1, strg);
		int fb2 = fibonacciTD(n - 2, strg);
		int fbans = fb1 + fb2;
		strg[n] = fbans;
		return fbans;
	}

	public static int fibonacciDU(int n) {
		int[] strg = new int[n + 1];
		strg[0] = 0;
		strg[1] = 1;
		for (int i = 2; i <= n; i++)
			strg[i] = strg[i - 1] + strg[i - 2];
		return strg[n];

	}

	public static int fibonacciDUSE(int n) {
		int strg[] = new int[2];
		;
		strg[0] = 0;
		strg[1] = 1;
		int sum = 0;
		for (int i = 2; i <= n; i++) {
			sum = strg[0] + strg[1];
			strg[0] = strg[1];
			strg[1] = sum;
		}
		return strg[1];
	}

	public static int boardPathTD(int curr, int end, int[] strg) {

		if (curr == end) {

			return 1;
		}

		if (curr > end) {
			return 0;
		}
		if (strg[curr] != 0)
			return strg[curr];

		int sum = 0;

		for (int dice = 1; dice <= 6; dice++) {
			sum += boardPathTD(curr + dice, end, strg);
			strg[curr] = sum;
		}

		return strg[curr];

	}

	public static int boardPathDU(int curr, int end, int[] strg) {

		if (curr == 0) {

			return 1;
		}

		if (curr < 0)
			return 0;

		if (strg[curr] != 0)
			return strg[curr];

		int sum = 0;

		for (int dice = 1; dice <= 6; dice++) {
			sum += boardPathDU(curr - dice, end, strg);
			strg[curr] = sum;
		}

		return strg[curr];

	}

	public static int boardPathBU(int end) {
		int[] strg = new int[end + 6];
		strg[end] = 1;
		for (int i = end - 1; i >= 0; i--) {
			int sum = 0;
			for (int j = i + 1; j <= i + 6; j++) {
				sum += strg[j];
			}
			strg[i] = sum;
		}
		return strg[0];
	}

	public static int boardPathDUSE(int end) {
		int[] strg = new int[6];
		strg[0] = 1;
		for (int i = end - 1; i >= 0; i--) {
			int sum = 0;
			for (int j = 0; j < 6; j++) {
				sum += strg[j];
			}
			// strg[6] = sum;
			strg[5] = strg[4];
			strg[4] = strg[3];
			strg[3] = strg[2];
			strg[2] = strg[1];
			strg[1] = strg[0];
			strg[0] = sum;
		}

		return strg[0];

	}

	public static int mazePathTD(int cr, int cc, int er, int ec, int[][] strg) {

		if (cr == er && cc == ec) {
			return 1;
		}

		if (cr > er || cc > ec) {
			return 0;
		}
		if (strg[cr][cc] != 0)
			return strg[cr][cc];

		int ch = mazePathTD(cr, cc + 1, er, ec, strg);
		int cv = mazePathTD(cr + 1, cc, er, ec, strg);
		strg[cr][cc] = ch + cv;
		return strg[cr][cc];

	}

	public static int mazePathBU(int er, int ec) {
		int[][] strg = new int[er + 2][ec + 2];

		for (int row = er; row >= 0; row--) {
			for (int col = ec; col >= 0; col--)
				if (row == er && col == ec)
					strg[er][ec] = 1;
				else
					strg[row][col] = strg[row + 1][col] + strg[row][col + 1];

		}
		return strg[0][0];

	}

	public static int mazePathBUSE(int er, int ec) {
		int[] strg = new int[ec + 1];
		Arrays.fill(strg, 1);
		for (int row = er - 1; row >= 0; row--) {
			for (int col = ec; col > 0; col--)
				strg[col - 1] = strg[col - 1] + strg[col];
		}
		return strg[0];
	}

	public static int LCS(String s1, String s2) {// Longest Common Substring
		if (s1.length() == 0 || s2.length() == 0)
			return 0;
		char c1 = s1.charAt(0);
		char c2 = s2.charAt(0);
		String ros1 = s1.substring(1);
		String ros2 = s2.substring(1);
		int ans;
		if (c1 == c2) {
			ans = LCS(ros1, ros2) + 1;
		} else {
			int o1 = LCS(s1, ros2);
			int o2 = LCS(ros1, s2);
			ans = Math.max(o1, o2);
		}
		return ans;
	}

	public static int LCSTB(String s1, String s2, int[][] strg) {// Longest
																	// Common
																	// Substring
		if (s1.length() == 0 || s2.length() == 0)
			return 0;
		char c1 = s1.charAt(0);
		char c2 = s2.charAt(0);
		String ros1 = s1.substring(1);
		String ros2 = s2.substring(1);

		for (int row = 0; row < s1.length(); row++) {
			for (int col = 0; col < s2.length(); col++) {
				if (strg[row][col] != 0)
					return strg[row][col];
				if (c1 == c2) {
					strg[row][col] = LCS(ros1, ros2) + 1;
				} else {
					int o1 = LCS(s1, ros2);
					int o2 = LCS(ros1, s2);
					strg[row][col] = Math.max(o1, o2);
				}
			}
		}
		return strg[0][0];
	}

	public static int LCSBU(String s1, String s2) {
		int[][] strg = new int[s1.length() + 1][s2.length() + 1];
		for (int row = s1.length() - 1; row >= 0; row--) {
			for (int col = s2.length() - 1; col >= 0; col--) {
				if (s1.charAt(row) == s2.charAt(col)) {
					strg[row][col] = strg[row + 1][col + 1] + 1;
				} else {
					int o1 = strg[row + 1][col];
					int o2 = strg[row][col + 1];
					strg[row][col] = Math.max(o1, o2);
				}

			}
		}
		return strg[0][0];
	}

	public static int EditDistance(String s1, String s2) {
		if (s1.length() == 0 || s2.length() == 0)
			return Math.max(s1.length(), s2.length());
		char c1 = s1.charAt(0);
		char c2 = s2.charAt(0);
		String ros1 = s1.substring(1);
		String ros2 = s2.substring(1);
		int ans = 0;

		if (c1 == c2) {
			ans = EditDistance(ros1, ros2);
		} else {
			int i = EditDistance(ros1, s2);
			int d = EditDistance(s1, ros2);
			int r = EditDistance(ros1, ros2);
			ans = Math.min(i, Math.min(d, r)) + 1;
		}
		return ans;

	}

	public static int EditDistanceBU(String s1, String s2) {
		int[][] strg = new int[s1.length() + 1][s2.length() + 1];
		for (int row = s1.length(); row >= 0; row--) {
			for (int col = s2.length(); col >= 0; col--) {
				if (row == s1.length()) {
					strg[row][col] = s2.length() - col;
					continue;
				}
				if (col == s2.length()) {
					strg[row][col] = s1.length() - row;
					continue;
				}
				if (s1.charAt(col) == s2.charAt(col))
					strg[row][col] = strg[row + 1][col + 1];
				else {
					int i = strg[row + 1][col];
					int d = strg[row][col + 1];
					int r = strg[row + 1][col + 1];
					strg[row][col] = Math.min(i, Math.min(d, r)) + 1;
				}
			}
		}
		return strg[0][0];
	}

}
