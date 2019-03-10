package L11;

public class Recursion_Print_Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print_permutation("abc", "");
	}

	public static void print_permutation(String qus, String ans) {
		if (qus.length() == 0) {
			System.out.println(ans);
			return;

		}
		for (int i = 0; i < qus.length(); i++) {
			char ch = qus.charAt(i);
			String rom = qus.substring(0, i) + qus.substring(i + 1);
			print_permutation(rom,ch+ ans);

		}
	}

}
