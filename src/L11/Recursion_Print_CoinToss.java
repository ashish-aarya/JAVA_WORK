package L11;

public class Recursion_Print_CoinToss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PrintCoinToss(3, "");
	}
	public static void PrintCoinToss (int n,String ans)
	{if (n==0)
	{
		System.out.println(ans);
		return;
	}
		for (int i=1;i<=n;i++)
		{
			PrintCoinToss(n-1,ans+"H");
			PrintCoinToss(n-1,ans+"T");
		}
	}

}
