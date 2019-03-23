package L16;

public class OOPS_NextGreater_cpx_n {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int ar[] = { 10, 20, 5, 3, 15 };
		int ans[] = displayNextgreater(ar);
		for (int i = 0; i < ans.length; i++)
			System.out.println(ar[i] + "->" + ans[i]);
	}

	public static int[] displayNextgreater(int[] ar) throws Exception {
		DynamicStack ds = new DynamicStack();
		int[] ans = new int[ar.length];
		for (int i = 0; i < ar.length; i++) {
			while (!ds.isempty() && ar[i] > ar[ds.peek()]) {
				ans[ds.pop()] = ar[i];
			}
			ds.push(i);
		}
		while (!ds.isempty()) {
			ans[ds.pop()] = -1;
		}
		return ans;
	}

//	public static int[] displayNextgreater2(int[] ar) throws Exception {
//		DynamicStack ds = new DynamicStack();
//		// int[] ans=new int[ar.length];
//		for (int i = 0; i < ar.length; i++) {
//			while (!ds.isempty() && ar[i] > ar[ds.pop()]) {
//
//			}
//			ds.push(i);
//		}
//		while (!ds.isempty()) {
//			ans[ds.peek()] = -1;
//		}
//		return ans;
//	}

}
