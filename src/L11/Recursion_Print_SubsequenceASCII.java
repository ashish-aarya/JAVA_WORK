package L11;

public class Recursion_Print_SubsequenceASCII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printSSASCII("abc", "");
	}

	public static void printSSASCII(String qus, String ans) {
		if (qus.length() == 0) {
			System.out.println(ans);
			return;
		}
		char ch = qus.charAt(0);
		String req = qus.substring(1);
		printSSASCII(req, ans);
		printSSASCII(req, ans + ch);
		printSSASCII(req, ans + (int) ch);

	}

}
