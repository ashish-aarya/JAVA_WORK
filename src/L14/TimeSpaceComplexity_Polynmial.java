package L14;

public class TimeSpaceComplexity_Polynmial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = polynomial(7, 5);
		System.out.println(n);
	}

	public static int polynomial(int x, int n) {
		int coff = n;
		int mulp = x;
		int sum = 0;
		while (coff > 0) {
			sum += coff * mulp;
			mulp = mulp * x;
			coff--;
		}
		return sum;
	}

}
