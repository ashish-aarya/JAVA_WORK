package L12;

public class Recursion_Print_CoinTossSkipH {
	static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printCoinTossConsSkip(3, "", false);
		// printCoinTossConsSkipM2(3, "");
	}

	public static void printCoinTossConsSkip(int n, String ans, boolean istrue) {
		if (n == 0) {
			count++;
			System.out.println(count + "." + ans);
			return;
		}
		if (istrue)
			printCoinTossConsSkip(n - 1, ans + "T", false);
		else {
			printCoinTossConsSkip(n - 1, ans + "H", true);
			printCoinTossConsSkip(n - 1, ans + "T", false);
		}
	}

	public static void printCoinTossConsSkipM2(int n, String ans) {
		if (n == 0) {
			count++;
			System.out.println(count + "." + ans);
			return;
		}
		if ( ans.length() == 0 || ans.charAt(ans.length() - 1) != 'H' )
			printCoinTossConsSkip(n - 1, ans + "H", true);
		printCoinTossConsSkip(n - 1, ans + "T", false);
	}
}
