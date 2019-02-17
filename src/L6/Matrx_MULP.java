package L6;

public class Matrx_MULP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
		int b[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
		display(matrx_mulp(a, b));

	}

	public static void display(int arr[][]) {
		for (int r = 0; r < arr.length; r++) {
			System.out.println("");
			for (int c = 0; c < arr[r].length; c++)
				System.out.print(arr[r][c] + " ");

		}
	}

	public static int[][] matrx_mulp(int ar[][], int arr[][]) {

		int array[][] = null;
		int r1 = ar.length;
		int c1 = ar[0].length;
		int r2 = arr.length;
		int c2 = arr[0].length;
		if (c1 == r2) {
			array = new int[r1][c2];
			for (int row = 0; row < array.length; row++) {
				for (int col = 0; col < array[0].length; col++) {
					int sum = 0;
					for (int k = 0; k < c1; k++)
						sum += ar[row][k] * arr[k][col];

					array[row][col] = sum;
				}
			}
		}
		return array;
	}

}
