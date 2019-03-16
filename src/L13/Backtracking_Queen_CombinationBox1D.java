package L13;

public class Backtracking_Queen_CombinationBox1D {
	static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
QueenComibinationBox(new boolean[4], 0, 0,2,"");
	}
	public static void QueenComibinationBox (boolean[] board,int idx,int qpsf,int tq,String ans )
	{
		if (tq==qpsf)
		{count++;
			System.out.println(count+"."+ans);		
			return ;
		}
		if (idx==board.length)
			return;
		board[idx]=true;
		QueenComibinationBox(board, idx+1, qpsf+1, tq, ans+"b"+idx);
		board[idx]= false;
		QueenComibinationBox(board, idx+1, qpsf, tq, ans);
		
	}

}
