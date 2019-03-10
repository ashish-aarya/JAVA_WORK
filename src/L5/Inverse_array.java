package L5;

import java.util.Scanner;

public class Inverse_array {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[];
		array = takeInput();
		array=inverse(array);
		for (int val:array)
		System.out.print(val);
		

	}
	
	public static int[] inverse(int arr[]) {
		int temp[];
		temp = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
      temp[arr[i]]=i;
		}
		return temp;
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
