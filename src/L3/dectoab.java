package L3;

import java.util.Scanner;

public class dectoab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n,b;
	       System.out.println ("Enter the term");
	       Scanner s=new Scanner(System.in);
	       n=s.nextInt();
	       System.out.println ("Base");
	       b=s.nextInt();
	       int mul=1,ans=0;
	       while (n!=0)
	       {
	    	   int rem=n%b;
	    	   n=n/b;
	    	   ans=ans+(rem*mul);
	    	   mul=mul*10;
	    	   
	       }
	       System.out.println(ans);
	    		   
	}

}
