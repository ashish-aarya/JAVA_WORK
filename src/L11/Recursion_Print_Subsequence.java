package L11;

public class Recursion_Print_Subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printSS("abc","");
	}

	public static void printSS(String qus, String ans) {
		if (qus.length() == 0) {
			System.out.println(ans);
			return;
		}
		char ch = qus.charAt(0);
		String req = qus.substring(1);
		printSS(req, ans);
		printSS(req, ans + ch);
	}

}
