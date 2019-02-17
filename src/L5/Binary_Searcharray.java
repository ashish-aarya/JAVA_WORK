package L5;

import java.util.Scanner;

public class Binary_Searcharray {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[],ss;
		array = takeInput();
		System.out.println("Enter  the no to search");
ss=s.nextInt();
System.out.println("INDEX"+BinSc(array, ss));
		
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

	public static int BinSc(int arr[],int src) {
		int low, mid, high;
		low = 0;
		high = arr.length - 1;
		
		while (low <= high) {
			mid = (low + high) / 2;
if (src>arr[mid])
{
	low=mid+1;
}
else if (src<arr[mid])
{
	high=mid-1;
}
else 
	return mid;
	
		}
		return -1;
		
	}

}
