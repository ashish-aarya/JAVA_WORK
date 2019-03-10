package L9;

public class Recursion_IDS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PDIS(8);
	}
	public static void PDIS(int n) {
		if (n == 0)
			return;
		if (n % 2 == 0)
			System.out.println(n);
		PDIS(n - 1);
		if (n % 2 != 0)
			System.out.println(n);
	}
}
