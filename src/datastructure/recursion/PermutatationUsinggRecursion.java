package datastructure.recursion;

public class PermutatationUsinggRecursion {

	public static void main(String[] args) {
		String str = "abc";
		print("", str);
	}

	static void print(String left, String right) {
		int n = right.length();
		if (n == 0) {
			return;
		} else if (n == 1) {
			System.out.println(left + right);
			return;
		}
		

	StringBuilder s = new StringBuilder(right);
	for(int i = 0;i<n;i++)
	{
		char temp = s.charAt(i);
		s.setCharAt(i, s.charAt(0));
		s.setCharAt(0, temp);
		print(left + temp, s.substring(1, n));
	}
}

}
