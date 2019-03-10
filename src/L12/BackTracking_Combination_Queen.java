package L12;

public class BackTracking_Combination_Queen {
	static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueenCombination(new boolean[4], 2, 0, "", -1);
	}

	public static void QueenCombination(boolean[] board, int tq, int qpsf, String ans, int lastcellused) {
		if (qpsf == tq) {
			count++;
			System.out.println(count + "." + ans);
			return;
		}

		for (int i = lastcellused + 1; i < board.length; i++) {
			if (board[i] == false) {
				board[i] = true;
				QueenCombination(board, tq, qpsf + 1, ans + "q" + (qpsf + 1) + "b" + i + "  ", i);
				board[i] = false;
			}
		}
	}

}
