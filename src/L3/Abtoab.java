package L3;

import java.util.Scanner;

public class Abtoab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,b,a;
	       System.out.println ("Enter the no.");
	       Scanner s=new Scanner(System.in);
	       n=s.nextInt();
	       System.out.println ("Base");
	       b=s.nextInt();
	       a=s.nextInt();
	       
	       int mul=1,ans=0;
	       while (n!=0)
	       {
	    	   int rem=n%10;
	    	   n=n/10;
	    	   ans=ans+(rem*mul);
	    	   mul=mul*b;
	    	   
	       }
	        mul=1; int answer=0;
	       while (ans!=0)
	       {
	    	   int rem=ans%a;
	    	   ans=ans/a;
	    	   answer=answer+(rem*mul);
	    	   mul=mul*10;
	    	   
	       }
	       System.out.println(answer);
	}

}
