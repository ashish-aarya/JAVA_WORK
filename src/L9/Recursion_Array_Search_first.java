package L9;

public class Recursion_Array_Search_first {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 40, 90, 30, 20, 80, 60 };
		System.out.println(searchfs(arr, 0, 30));
	}

	public static int searchfs(int ar[], int vid, int item) {
		if (vid == ar.length)
			return -1;
		if (item == ar[vid])
			return vid;
		int rsc = searchfs(ar, vid + 1, item);

		return rsc;

	}

}
