package L5;

import java.util.Scanner;

public class Inserstion_Sort {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[];
		array = takeInput();
		display(array);
		System.out.println("");
	insr_sor(array);
	display(array);
		
	}

	public static void insr_sor(int arr[]) {
		int counter = 1;
		for (; counter < arr.length; counter++) {
			int item = arr[counter];
			int j = counter - 1;
			while (j >= 0 && arr[j] > item) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = item;
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
	public static void display(int[] arr) {
		for (int val : arr) {
			System.out.print(val + " ");
		}
}
}
