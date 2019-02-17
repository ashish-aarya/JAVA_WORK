package L3;

import java.util.Scanner;

public class Rotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n, b, r;
		System.out.println("Enter the term");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		System.out.println("Time");
		b = s.nextInt();
		int temp = n, flag = 0;
		while (temp != 0) {
			temp /= 10;
			flag++;
		}
		b = b % flag;
		if (b < 0)
			b = b + flag;

		int fr = n % (int) Math.pow(10, b);
		int en = n / (int) Math.pow(10,  b);
		int nwnm = fr * (int) Math.pow(10, (flag - b)) + en;
		System.out.print(nwnm);

	}

}
