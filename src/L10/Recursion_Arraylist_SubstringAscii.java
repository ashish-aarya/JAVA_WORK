package L10;

import java.util.ArrayList;

public class Recursion_Arraylist_SubstringAscii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getSSAscii("ab"));
	}
public static ArrayList<String> getSSAscii (String str)
{
 if (str.length()==0)
 {
	 ArrayList<String> br=new ArrayList<>();
	 br.add("");
	 return br;
 }
 char ch=str.charAt(0);
  String ros=str.substring(1);
  ArrayList<String> rr=getSSAscii(ros);
  ArrayList<String> mr=new ArrayList<>();
  for (String val: rr)
  {
	  mr.add(val);
	  mr.add(ch+val);
	  mr.add((int)ch+val);
  }
  return mr;
  }
}
