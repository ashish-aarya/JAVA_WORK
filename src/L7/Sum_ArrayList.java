package L7;

import java.util.Scanner;
import java.util.ArrayList;

public class Sum_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Ar[], Arr[], n1, n2;
		Scanner s = new Scanner(System.in);
		System.out.println("Term");
		n1 = s.nextInt();
		n2 = s.nextInt();
		Ar = new int[n1];
		Arr = new int[n2];
		System.out.println("ELEMENT");
		for (int i = 0; i < n1; i++)
			Ar[i] = s.nextInt();
		System.out.println("ELEMENT");
		for (int j = 0; j < n2; j++)
			Arr[j] = s.nextInt();
		System.out.println(sum(Ar, Arr));
	}

	// public static int digit(int n) {
	// return n / 10;
	// }

	public static ArrayList<Integer> sum(int[] one, int[] two) {
		ArrayList<Integer> ans = new ArrayList<>();
		int sum = 0;
		int carry = 0;
		for (int i = one.length - 1, j = two.length - 1; i >= 0 || j >= 0; i--, j--) {
			sum = carry;
			if (i >= 0)
				sum += one[i];
		 if (j >= 0)
				sum += two[j];
			ans.add(0, sum % 10);
			carry = sum / 10;
		}
		if (carry != 0)
			ans.add(0, carry);
		return ans;
	}

}
