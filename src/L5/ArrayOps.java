package L5;

import java.util.Scanner;

public class ArrayOps {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = takeInput();
		System.out.println("ARRAY DISPLAY");
		display(array);
		int max = maximum(array);
		System.out.println("MAXIMUM" + max);
		System.out.println("Search and enter element");
		int sr = s.nextInt();
		search(array, sr);

	}

	public static int[] takeInput() {
		int arr[], n;
		System.out.println("Enter the Term");
		n = s.nextInt();
		arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}

	public static void display(int[] arr) {
		for (int val : arr) {
			System.out.print(val + " ");
		}

	}

	public static int maximum(int arr[]) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			max = Math.max(max, arr[i]);
		}
		return max;

	}

	public static void search(int arr[], int ter) {
		int ind = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ter) {
				ind = i ;
				break;
			} 
		}
		System.out.println("Search el" + ind);
	}

}
