package datastructure.recursion;

public class PowerToNUsingRecursion {

	public static void main(String[] args) {
		int num = 3, pow = 5;
		
		System.out.println(num+" to power "+pow +" :"+ power(num, pow));

	}

	private static int  power(int num, int pow) {
		
		if(pow == 0) {
			return 1;
		}
		return num * power(num, pow-1);
	}

}
