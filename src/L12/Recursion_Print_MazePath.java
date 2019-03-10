package L12;

public class Recursion_Print_MazePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printMazePath("", 0, 0, 2, 2);
	}

	public static void printMazePath(String ans, int cr, int cc, int er, int ec) {
		if (cr == er && cc == er) {
			System.out.println(ans);
			return;
		}
		if (cc <= ec) {
			//for (int mo = 1; mo <= ec; mo++)
				printMazePath(ans + "H", cr, cc + 1, er, ec);
		}
		if (cr <= er) {
			//for (int mo = 1; mo <= ec; mo++)
				printMazePath(ans + "V", cr + 1, cc, er, ec);
		}
	}

}
