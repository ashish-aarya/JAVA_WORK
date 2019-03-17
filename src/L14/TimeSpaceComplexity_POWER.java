package L14;

public class TimeSpaceComplexity_POWER {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value = Power(2, 5);
		System.out.println(value);

	}

	public static int Power(int n, int p) {
		if (p == 0) {
			return 1;
		}
		int sp = Power(n, p / 2);
		// int p2=Power(n, p/2);
		int po = sp * sp;
		if (p % 2 == 0)
			return po;
		else
			return po * n;
	}

}
