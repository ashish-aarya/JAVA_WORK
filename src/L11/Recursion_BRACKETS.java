package L11;

public class Recursion_BRACKETS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parenthesis(3, "", 0, 0);
	}

	public static void parenthesis(int n, String ans, int open, int close) {
		if (open == n && close == n) {
			System.out.println(ans);
			return;
		}
		if (open > n || close > n || close > open)
			return;
		parenthesis(n, ans + "(", open + 1, close);
		parenthesis(n, ans + ")", open, close + 1);
	}

}
