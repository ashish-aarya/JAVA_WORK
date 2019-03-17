package L14;

public class Recursion_QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[] = { 50, 40, 80, 90, 70, 10, 30, 60, 120 };
		for (int var : ar)
			System.out.print(var + " ");
		quickSort(ar, 0, ar.length - 1);
		System.out.println("");
		for (int var : ar)
			System.out.print(var + " ");

	}

	public static void quickSort(int[] arr, int lo, int hi) {
		if (lo >= hi) {
			return;
		}
		int mid = (lo + hi) / 2;
		int pivot = arr[mid];
		int left = lo;
		int right = hi;
		while (left <= right) {
			while (arr[left] < pivot) {
				left++;
			}
			while (arr[right] > pivot) {
				right--;
			}
			if (left <= right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
			quickSort(arr, lo, right);
			quickSort(arr, left, hi);

		}
	}

}
