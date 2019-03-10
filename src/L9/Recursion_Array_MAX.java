package L9;

public class Recursion_Array_MAX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 40, 30, 20, 80,60 };
		System.out.println(array_max(arr, 0));
	}

	public static int array_max(int ar[], int vid) {
		if (vid == ar.length -1)
			return ar[vid];
		int max = ar[vid];
		// max=(int)Math.max(ar[vid]`, ar[vid-1]);
		max = array_max(ar, vid + 1);
		if (max < ar[vid])
			max = ar[vid];
		return max;
	}
}
