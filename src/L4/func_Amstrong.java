package L4;

import java.util.Scanner;

public class func_Amstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f,e;
	      System.out.println("Enter The lower and upper limit");
	      Scanner s=new Scanner(System.in);
	      f=s.nextInt();
	      e=s.nextInt();
	      for (int i=f;i<=e;i++ )
	      {
	    	  if (isAmstrong(i)==true)
	    		  System.out.println(i);
	      }
	}
	public static int numofdigit(int n)
	{int count=0;
	while(n!=0)
	{
		count++;
		n/=10;
	}
	return count;
	}
	public static boolean isAmstrong(int n)
	{
		int temp=n,sum=0;
		int count= numofdigit(n);
		while (temp!=0)
		{
		int rem=temp%10;
		sum+=(int)Math.pow(rem,count);
		temp/=10;
		}
		if (sum==n)		
			return true;
		else 
			return false;
	}
}
