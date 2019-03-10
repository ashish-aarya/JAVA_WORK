package L9;

public class Recursion_FIBO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(fibo(6));
	}
	public static int fibo (int n)
	{
		if (n==0||n==1)
return n;
		int fb1=	fibo (n-1);
		int fb2=	fibo (n-2);
	int fb=fb2+fb1;
	return fb;
		}
	

}
