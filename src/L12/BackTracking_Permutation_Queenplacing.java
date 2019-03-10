package L12;

public class BackTracking_Permutation_Queenplacing {
	static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueenPermutations(new boolean[4], 2, 0, "");
	}

	public static void QueenPermutations(boolean[] board, int tq, int qpsf, String ans) {
		if (qpsf == tq) {
			count++;
			System.out.println(count + "." + ans);
			return;
		}

		for (int i = 0; i < board.length; i++) {
			if (board[i] == false) {
				board[i] = true;
				QueenPermutations(board, tq, qpsf + 1, ans + "q" + (qpsf + 1) + "b" + i + "  ");
				board[i] = false;
			}
		}
	}

}
