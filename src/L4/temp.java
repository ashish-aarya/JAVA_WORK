package L4;

import java.util.Scanner;

public class temp {

	public static void main(String[] args) {
		int min,max,tr;
	       System.out.println ("Enter the term");
	       Scanner s=new Scanner(System.in);
	       min=s.nextInt();
	       max=s.nextInt();
	       tr=s.nextInt();
	     //  System.out.println("DB");
	       for (int temp=min;temp<=max;temp+=tr)
	       {
	    	   int cel=(int)((5.0/9)*(temp-32));
	    	   System.out.println(temp+"\t"+cel);
	       }
	}

}
