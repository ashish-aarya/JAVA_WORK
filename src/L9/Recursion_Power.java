package L9;

public class Recursion_Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(power(2, 4));
	}

	public static int power(int X, int N) {
		if (N == 0)
			return 1;
		int x = power(X, N - 1);
		int y = x * X;
		return y;

	}

}
