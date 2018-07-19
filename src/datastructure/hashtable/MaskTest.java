package datastructure.hashtable;

import java.util.Arrays;
import java.util.List;

public class MaskTest {

	public static void main(String[] args) {
		
		int number = 102;
		int mask = 0x7FFFFFFF;
		int capacity =16;		
		int result = (number & mask)%capacity;
		System.out.println(result);
		
		//hash code for strings
		
		List<String> list = Arrays.asList("Sachin", "Rane", "Pune", "Virtusa");
		
		for (String string : list) {
			System.out.println((string.hashCode() & mask)%capacity);
		}
	}

}
