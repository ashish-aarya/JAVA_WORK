package L6;

public class wave_display_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[][] = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 }, { 100, 110, 120 } };
		wave_disp(array);
	}

	public static void wave_disp(int arr[][]) {
		int s;
		for (int r = 0; r < arr[0].length; r++) {
			if (r % 2 == 0)
				s = 0;
			else
				s = arr.length -1;
			for (int c = 0; c < arr.length; c++) {
				System.out.print(arr[s][r] + " ");
				if (r % 2 == 0)
					s++;
				else
					s--;
			}
		}
	}

}
