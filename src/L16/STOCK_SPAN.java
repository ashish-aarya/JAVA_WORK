package L16;

public class STOCK_SPAN {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int ar[] = { 100, 20, 30, 90, 60, 50, 70, 80, 120, 110, 50 };
		int ans[] = StockSpan(ar);
		for (int i = 0; i < ans.length; i++)
			System.out.println(ar[i] + "->" + ans[i]);
	}

	public static int[] StockSpan(int[] ar) throws Exception {
		DynamicStack ds = new DynamicStack();
		int[] ans = new int[ar.length];
		for (int i = 0; i < ar.length; i++) {
			while (!ds.isempty() && ar[i] > ar[ds.peek()]) {
				ds.pop();
			}
			if (ds.isempty()) {
				ans[i] = i + 1;
			} else {
				ans[i] = i - ds.peek();
			}

			ds.push(i);
		}
		return ans;
	}

}
