package other;

import java.util.regex.Pattern;

public class WhitespaceCharTest {

	public static void main(String[] args) {
		
		System.out.println("I am \rsachin and I am \fvery cool person!! ");
		System.out.println("I am \nsachin and I am \fvery cool person!! ");
		
		
		System.out.println(Pattern.matches("(Sa)(chi)\\2\\1", "SachinchiSa"));
		System.out.println(Pattern.matches("(AB)(B\\d)\\2\\1", "ABB2B2AB"));

	}

}
