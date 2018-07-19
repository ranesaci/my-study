package datastructure.recursion;

import java.util.Arrays;

public class MaxNumberUsingRecursion {
	static int[] arr = {6,8,2,900,1,7};

	public static void main(String[] args) {
		System.out.println("given array : "+ Arrays.toString(arr));
		System.out.println("Max Number : "+findMaxNum(arr.length));

	}

	private static int findMaxNum(int length) {
		if(length == 1) {
			return arr[0];
		}
		
		int m = findMaxNum(length-1);
		if(m<arr[length-1]) {
			return arr[length-1];
		}else {
			return m;
		}
		
	}

}
