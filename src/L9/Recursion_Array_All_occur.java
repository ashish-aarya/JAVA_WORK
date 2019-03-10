package L9;

public class Recursion_Array_All_occur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 40, 90, 30, 20, 30, 60 };

		int a[] = alloccourance(arr, 0, 30, 0);
		for (int i = 0; i < a.length; i++)
			System.out.println(a[i]);
	}

	public static int[] alloccourance(int ar[], int vid, int item, int count) {
		if (vid == ar.length) {
			int arr[] = new int[count];
			return arr;
		}
		if (item == ar[vid]) {
			int res[] = alloccourance(ar, vid + 1, item, count + 1);
			res[count] = vid;
			return res;
		} else {
			int res[] = alloccourance(ar, vid + 1, item, count);
			return res;
		}
	}

}
