package L4;

import java.util.Scanner;

public class checkcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      char ch;
      System.out.println("Enter The character");
      Scanner s=new Scanner(System.in);
      ch=s.next().charAt(0);
      if (ch>='A'&&ch<='Z')
    	  System.out.println("Upper");

      else if (ch>='a'&&ch<='z')
    	  System.out.println("lower");
      else
    	  System.out.println("Invalid");
      
	}

}
