package L13;

public class Backtracking_Queen_CombinationBox2D {
	static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		QueenComibinationBox2D(new boolean[2][4], 0, 0, 0, 2, "");
	}

	public static void QueenComibinationBox2D(boolean[][] board, int row, int col, int qpsf, int tq, String ans) {
		if (tq == qpsf) {
			count++;
			System.out.println(count + "." + ans);
			return;
		}

		if (col == board[0].length) {
			row++;
			col = 0;
		}
		if (row == board.length) {
			return;
		}
		board[row][col] = true;
		QueenComibinationBox2D(board, row, col + 1, qpsf + 1, tq, ans + "b[" + row + "-" + col + "]");
		board[row][col] = false;
		QueenComibinationBox2D(board, row, col + 1, qpsf, tq, ans);

	}

}
