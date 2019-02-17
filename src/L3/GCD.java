package L3;
import java.util.Scanner;
import java.util.*;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1, n2;
		System.out.println("Enter the term");
		Scanner s = new Scanner(System.in);
		n1 = s.nextInt();
		n2 = s.nextInt();
		int  rem = 0;
		while (n1 % n2 != 0) {
			rem = n1 % n2;
			n1 = n2;
			n2 = rem;
		}
		System.out.println(rem);

	}

}
