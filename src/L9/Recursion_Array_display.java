package L9;

public class Recursion_Array_display {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 10, 20, 30, 40 };
		array_disp(arr, 0);
	}

	public static void array_disp(int ar[], int vid) {
		if (vid == ar.length)
			return;
		System.out.print(ar[vid] + " ");
		array_disp(ar, vid + 1);

	}

}
