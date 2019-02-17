package L5;

import java.util.Scanner;

public class Bubble_Short {
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[];
		array=takeInput();
		//display(array);
		bubble_short(array);
		display(array);
		

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
	public static void bubble_short(int arr[])
	{
		for (int counter=0;counter<arr.length-1;counter++)
		{
			for (int j=0;j<arr.length-1;j++)
			{
				if (arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}

}
