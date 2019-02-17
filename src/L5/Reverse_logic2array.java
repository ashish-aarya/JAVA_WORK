package L5;

import java.util.Scanner;

public class Reverse_logic2array {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[];
		array = takeInput();
		 rever(array);
		for (int val : array)
			System.out.print(val + " ");

	}

	public static void rever(int arr[]) {
		int  temp=0,j=arr.length-1;
		//temp = new int[arr.length];
		for (int i = 0; i <arr.length/2; i++) {
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			j--;
		}
		
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



