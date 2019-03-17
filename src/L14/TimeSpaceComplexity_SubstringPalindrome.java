package L14;

public class TimeSpaceComplexity_SubstringPalindrome {
	static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		countPalindromicSS("nnititiit");
		System.out.println(count);
	}

	public static int countPalindromicSS(String str) {// odd nin
		for (int axis = 0; axis < str.length(); axis++) {
			for (int orbit = 0; axis - orbit >= 0 && orbit + axis < str.length(); orbit++) {
				if (str.charAt(axis - orbit) == str.charAt(axis + orbit))
					count++;
				else
					break;
			}
		} // even nn
		for (double axis = 0.5; axis < str.length(); axis++) {
			for (double orbit = 0.5; axis - orbit >= 0 && orbit + axis < str.length(); orbit++) {
				if (str.charAt((int) (axis - orbit)) == str.charAt((int) (axis + orbit)))
					count++;
				else
					break;
			}
		}
		return count;
	}
}
