package L5;

import java.util.Scanner;

public class REVERSEarray {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[];
		array = takeInput();
		array = rever(array);
		for (int val : array)
			System.out.print(val + " ");

	}

	public static int[] rever(int arr[]) {
		int temp[], j = 0;
		temp = new int[arr.length];
		for (int i = arr.length-1; i >=0; i--) {
			temp[j] = arr[i];
			j++;
		}
		return temp;
	}

	public static int[] takeInput() {
		int arr[];
		int n;
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
