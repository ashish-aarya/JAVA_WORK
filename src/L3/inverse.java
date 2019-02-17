package L3;

import java.util.Scanner;

public class inverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,nw=0;
		System.out.println("Enter the term");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
	    int pla=1,ans=0;
	    int temp=n,rem;
		while (n!=0)
		{
			rem=n%10;
			ans=ans+pla*(int)Math.pow(10, rem-1);
			pla++;
			n=n/10;
			}
		System.out.println(ans);
	}

}
