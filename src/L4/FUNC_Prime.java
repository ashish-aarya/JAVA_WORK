package L4;

import java.util.Scanner;

public class FUNC_Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f, e;
		System.out.println("Enter The lower and upper limit");
		Scanner s = new Scanner(System.in);
		f = s.nextInt();
		e = s.nextInt();
		for (int i = f; i <= e; i++) {
			if (isprime(i) == true)
				System.out.println(i);
		}
	}

	public static boolean isprime(int n) {
		int count = 0;
		for (int i = 1; i <=n; i++) {
			if (n % i == 0)
				count++;
		}
		if (count == 2)
			return true;
		else
			return false;
	}

}
