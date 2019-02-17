package L3;

import java.util.Scanner;

public class Decitobin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
	       System.out.println ("Enter the term");
	       Scanner s=new Scanner(System.in);
	       n=s.nextInt();
	       int mul=1,ans=0;
	       while (n!=0)
	       {
	    	   int rem=n%2;
	    	   n=n/2;
	    	   ans=ans+(rem*mul);
	    	   mul=mul*10;
	    	   
	       }
	       System.out.println(ans);
	    		   
	}

}
