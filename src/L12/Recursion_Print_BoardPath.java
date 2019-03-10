package L12;

public class Recursion_Print_BoardPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintBoardPath("", 0, 4);
	}

	public static void PrintBoardPath(String ans, int start, int end) {
		if (start == end) {
			System.out.println(ans);
			return;
		}
		if (start > end)
			return;
		for (int i = 1; i <= 6; i++)
			PrintBoardPath(ans + i, start + i, end);

	}

}
