package L6;

import java.util.Scanner;

public class Vertical_Dis_array {
	static Scanner src = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]array;
	    array= inprect();
	    V_display(array);
	}

	public static void V_display(int arr[][]) {
		for (int r = 0; r < arr.length; r++) {
			//System.out.println("");
			for (int c = 0; c < arr[r].length; c++)
				System.out.print(arr[c][r] + " ");

		}
	}

	public static int[][] inprect() {
		int arr[][];
		System.out.println("Row");
		int row = src.nextInt();
		System.out.println("Coloumn");
		int col = src.nextInt();
		arr = new int[row][col];
		for (int r = 0; r < arr.length; r++) {
			for (int c = 0; c < arr[r].length; c++) {
				arr[r][c] = src.nextInt();

			}
		}
		return arr;
	}
}
