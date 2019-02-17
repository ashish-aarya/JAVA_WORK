package L6;

import java.util.Scanner;

public class inpt_disp_jagged_array {
	static Scanner src = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int [][]array;
    array= inpjagged();
    display(array);
	}
	public static void display(int arr[][])
	{
		for (int r = 0; r < arr.length; r++) {
			System.out.println("");
			for (int c = 0; c < arr[r].length; c++) 
				System.out.print(arr[r][c]+" ");

			}
	}

	public static int[][] inpjagged() {
		int arr[][];
		System.out.println("Row");
		int row = src.nextInt();
		arr = new int[row][];
		for (int r = 0; r < arr.length; r++) {
			System.out.println("Coloumn");
			int col = src.nextInt();
			arr[r] = new int[col];
			for (int c = 0; c < arr[r].length; c++) {
				arr[r][c] = src.nextInt();

			}
		}
return arr;
	}
}