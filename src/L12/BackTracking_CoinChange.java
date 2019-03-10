package L12;

public class BackTracking_CoinChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CoinChange(new int[] { 2, 3, 5, 6 }, 10, "", 0);

	}

	public static void CoinChange(int[] denom, int amount, String ans, int lastcoinused) {
		if (amount==0) {
			System.out.println(ans);
			return;
		}
		if (amount<0)
			return;
			
		for (int i = lastcoinused; i < denom.length; i++) {
						
			CoinChange(denom, amount-denom[i], ans + denom[i], i);
		}
	}
}
