package L9;

public class Recursion_Array_Search_last {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 40, 90, 30, 20, 30, 60 };
		System.out.println(searchls(arr, 0, 30));
	}

	public static int searchls(int ar[], int vid, int item) {
		if (vid == ar.length)
			return -1;
		
		int rsc = searchls(ar, vid + 1, item);
		if (item == ar[vid]&&rsc==-1)
			return vid;
		return rsc;
	}

}
