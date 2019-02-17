package L6;

public class Spiral_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[][] = { { 1, 2, 3, 4, 5, 6 }, 
				{ 7, 8, 9, 10, 11, 12 }, 
				{ 13,14,15,16,17,18 }, 
				{ 19,20,21,22,23,24} };
spiral_disp(array);
	}

	static void spiral_disp(int arr[][]) {
		int mincol, minrow, maxcol, maxrow, count = 0;
		mincol = 0;
		minrow = 0;
		maxrow = arr.length - 1;
		maxcol = arr[0].length - 1;
		int net = arr.length * arr[0].length;
		while (count < net) {

			for (int row = minrow; row <= maxrow && count < net; row++) {
				System.out.print(arr[row][mincol] + " ");
				count++;
			}
			mincol++;
			for (int col = mincol; col <= maxcol && count < net; col++) {
				System.out.print(arr[maxrow][col] + " ");
				count++;
			}
			maxrow--;
			for (int row = maxrow; row >= minrow && count < net; row--) {
				System.out.print(arr[row][maxcol] + " ");
				count++;
			}
			maxcol--;
			for (int col = maxcol; col>= mincol && count < net; col--) {
				System.out.print(arr[minrow][col] + " ");
				count++;
			}
			minrow++;

		}

	}
}
