package L13;

public class Recursion_MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int ar[]={20,40,10,50,45,6,80};
int ans[]=new int [ar.length];
ans=mergeSort(ar, 0, ar.length-1);
for (int val:ans)
	System.out.print(val+" ");
	}

	public static int[] mergeSortTwoarray(int[] one, int[] two) {
		int[] ans = new int[one.length + two.length];
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < one.length && j < two.length) {
			if (one[i] < two[j]) {
				ans[k] = one[i];
				i++;
				k++;
			} else {
				ans[k] = two[j];
				j++;
				k++;
			}
		}
		if (i == one.length) {
			while (j < two.length) {
				ans[k] = two[j];
				j++;
				k++;
			}
		}
		if (j == two.length) {
			while (i < one.length) {
				ans[k] = one[i];
				i++;
				k++;
			}
		}
		return ans;
	}

	public static int[] mergeSort(int[] arr, int lo, int hi) {

		if (lo == hi) {
			int br[] = new int[1];
			br[0]=arr[lo];
			return br;
		}
		int mid = (lo + hi) / 2;
		int fh[] = mergeSort(arr, lo, mid);
		int sh[] = mergeSort(arr, mid + 1, hi);
		int sort[] = mergeSortTwoarray(fh, sh);
		return sort;
	}
}
