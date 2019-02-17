package L3;
import java.util.*;
import java.util.Scanner;

public class abtodec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,b;
	       System.out.println ("Enter the no.");
	       Scanner s=new Scanner(System.in);
	       n=s.nextInt();
	       System.out.println ("Base");
	       b=s.nextInt();
	       int mul=1,ans=0;
	       while (n!=0)
	       {
	    	   int rem=n%10;
	    	   n=n/10;
	    	   ans=ans+(rem*mul);
	    	   mul=mul*b;
	    	   
	       }
	       System.out.println(ans);
	}

}
