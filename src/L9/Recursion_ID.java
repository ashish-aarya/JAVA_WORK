package L9;

public class Recursion_ID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PDI(6);
	}

	
	public static void PDI(int n) {
		if (n == 0)
			return;
		
			System.out.println(n);
		PDI(n - 1);
		
			System.out.println(n);
	}
	
}
