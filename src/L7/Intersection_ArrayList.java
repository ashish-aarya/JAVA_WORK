package L7;

import java.util.ArrayList;
import java.util.Scanner;

public class Intersection_ArrayList {

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
		System.out.println(intersection(Ar, Arr));

	}

	public static ArrayList<Integer> intersection(int[] one, int[] two) {
		ArrayList<Integer> ans = new ArrayList<>();
		for (int i = 0, j = 0; i < one.length && j < two.length;) {
			if (one[i] == two[j]) {
				ans.add(one[i]);
				i++;
				j++;
			} else if (one[i] < two[j])
				i++;
			else
				j++;
		}
		return ans;
	}
}
