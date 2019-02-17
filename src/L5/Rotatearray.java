package L5;

import java.util.Scanner;

public class Rotatearray {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int array[];
		// TODO Auto-generated method stub
		array = takeInput();
		int val;
		System.out.println("Enter the term to rotate");
		val = s.nextInt();
		rotat(array, val);
		for (int pr : array)
			System.out.println(pr);

	}

	public static void rotat(int ar[], int val) {
		val = val % ar.length;
		if (val < 0)
			val = val + ar.length;
		for (int pr = 1; pr <= val; pr++) {
			int temp = ar[ar.length - 1];
			for (int i = ar.length - 1; i >= 1; i--) {
				ar[i] = ar[i - 1];
			}

			ar[0] = temp;
		}
	}

	public static int[] takeInput() {
		int arr[], n;
		System.out.println("Enter the Term");
		n = s.nextInt();
		arr = new int[n];
		System.out.println("Enter the element");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
}
