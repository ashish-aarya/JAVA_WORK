package L8;
import java.util.Scanner;
public class Sub_string_print {
public static Scanner scr=new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 System.out.println("BLOCK");
		String scn= scr.next();
 substring(scn);
	}
	public static void  substring (String S)
	{int n=S.length();
		for (int i=0;i<=n;i++)
		{
			for (int j=i;j<n;j++)
				System.out.println(S.substring(i,j+1));
		}
		System.out.println("");
	}

}
