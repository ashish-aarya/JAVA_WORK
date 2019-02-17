package L3;
import java.util.Scanner;
import java.util.*;

public class fibo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("Enter the term");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		int sum = 0, a = 0, b = 1;
		System.out.print(a + " " + b + " ");
		for (int i = 0; i<n-1; i++) {
			sum = a + b;
			a = b;
			b = sum;
			System.out.print(sum + " ");
		}
	}

}
