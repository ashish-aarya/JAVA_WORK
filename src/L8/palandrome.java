package L8;

import java.util.Scanner;

public class palandrome {
	public static Scanner scr = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ENTER");
		String scn = scr.next();
		if (palend(scn))
			System.out.println("Palendrome");
		else
			System.out.println("NOT Palendrome");
	}

	public static boolean palend(String sc) {
	int lt=0,rt=sc.length()-1;
	while(lt<rt)
			
	{
		if (sc.charAt(lt)!=sc.charAt(rt))
			return false;
		lt++;
		rt--;
	}
	return true;
	}
}
