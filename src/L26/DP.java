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
		// System.out.println(EditDistance(s1, s2));
		// System.out.println(EditDistanceBU(s1, s2));
		int ar[] = { 2, 3, 5, 1, 4 };
		// System.out.println(MCM(ar, 0, ar.length - 1));
		// System.out.println(MCMTD(ar, 0, ar.length - 1, new
		// int[ar.length][ar.length]));
		// System.out.println(MCMBU(ar));
		System.out.println(WineProblem(ar, 0, ar.length - 1, 1));
		System.out.println(WineProblemTD(ar, 0, ar.length - 1, new int[ar.length][ar.length]));
		System.out.println(WineProblemBU(ar));
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

	public static int MCM(int[] arr, int si, int ei) {// Recursion Matrix Mulp.
														// Min

		if (si + 1 == ei)
			return 0;

		int min = Integer.MAX_VALUE;
		for (int k = si + 1; k <= ei - 1; k++) {
			int lf = MCM(arr, si, k);
			int rf = MCM(arr, k, ei);
			int sf = arr[si] * arr[ei] * arr[k];
			int total = sf + lf + rf;
			if (total < min) {
				min = total;
			}
		}
		return min;

	}

	public static int MCMTD(int[] arr, int si, int ei, int[][] strg) {// Recursion
																		// Matrix
																		// Mulp.
		// Min

		if (si + 1 == ei)
			return 0;
		if (strg[si][ei] != 0)
			return strg[si][ei];
		int min = Integer.MAX_VALUE;
		for (int k = si + 1; k <= ei - 1; k++) {
			int lf = MCMTD(arr, si, k, strg);
			int rf = MCMTD(arr, k, ei, strg);
			int sf = arr[si] * arr[ei] * arr[k];
			int total = sf + lf + rf;
			if (total < min) {
				min = total;
			}
			strg[si][ei] = min;
		}
		return min;

	}

	public static int MCMBU(int[] arr) {
		int n = arr.length;
		int[][] strg = new int[n][n];
		for (int slide = 1; slide <= n - 2; slide++) {
			for (int si = 0; si < n - slide - 1; si++) {
				int min = Integer.MAX_VALUE;
				int ei = si + slide + 1;
				for (int k = si + 1; k <= ei - 1; k++) {
					int lf = strg[si][k];
					int rf = strg[k][ei];
					int sf = arr[si] * arr[ei] * arr[k];
					int total = sf + lf + rf;
					if (total < min) {
						min = total;
					}
					strg[si][ei] = min;
				}

			}
		}

		// for(int[] i :strg){
		// for(int j : i){
		// System.out.print(j+" ");
		// }
		// System.out.println();
		// }
		return strg[0][n - 1];
	}

	public static int WineProblem(int[] arr, int si, int ei, int yr) {
		if (si == ei)
			return arr[si] * yr;
		int start = WineProblem(arr, si + 1, ei, yr + 1) + arr[si] * yr;
		int end = WineProblem(arr, si, ei - 1, yr + 1) + arr[ei] * yr;
		int ans = Math.max(start, end);
		return ans;

	}

	public static int WineProblemTD(int[] arr, int si, int ei, int[][] strg) {
		int yr = arr.length - (ei - si + 1) + 1;
		if (si == ei)
			return arr[si] * yr;
		if (strg[si][ei] != 0)
			return strg[si][ei];
		int start = WineProblemTD(arr, si + 1, ei, strg) + arr[si] * yr;
		int end = WineProblemTD(arr, si, ei - 1, strg) + arr[ei] * yr;
		int ans = Math.max(start, end);
		strg[si][ei] = ans;
		return strg[si][ei];

	}

	public static int WineProblemBU(int[] arr) {
		int n = arr.length;
		int[][] strg = new int[n][n];
		for (int slide = 0; slide <= n - 1; slide++) {
			for (int si = 0; si <= n - slide - 1; si++) {
				int ei = si + slide;
				int yr = arr.length - (ei - si + 1) + 1;
				if (si == ei) {
					strg[si][ei] = arr[ei] * yr;
				} else {

					int start = strg[si + 1][ei] + arr[si] * yr;
					int end = strg[si][ei-1]  + arr[ei] * yr;
					int ans = Math.max(start, end);
					strg[si][ei] = ans;
				}
			}
		}
		
//		for(int i[] : strg){
//			for(int j :i){
//				System.out.print(j + " ");
//			}System.out.println();
//		}
		return strg[0][n - 1];
	}

}
