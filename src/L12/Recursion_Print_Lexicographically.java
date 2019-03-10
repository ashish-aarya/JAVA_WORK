package L12;

public class Recursion_Print_Lexicographically {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printLexicoCounting(0, 1000);
	}

	public static void printLexicoCounting(int curr, int end) {
		if (curr > end)
			return;
		System.out.println(curr);
		int i = 0;
		if (curr == 0)
			i = 1;
		for (; i <= 9; i++) {
			printLexicoCounting(curr * 10 + i, end);
		}
	}
}
