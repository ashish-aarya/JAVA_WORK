package L3;

import java.util.Scanner;

public class Bintodec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
	       System.out.println ("Enter the term");
	       Scanner s=new Scanner(System.in);
	       n=s.nextInt();
	       int mul=1,ans=0;
	       
	       while (n!=0)
	       {
	    	   int rem=n%10;
	    	   n=n/10;
	    	   ans=ans+(rem*mul);
	    	   mul=mul*2;
	    	   
	       }
	       System.out.println(ans);
	    		   
	}

}
