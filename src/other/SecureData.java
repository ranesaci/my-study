package other;
import java.util.Arrays;
import java.util.List;

public class SecureData {
	public static void main(String[] args) {
		String input = "sachin rane";
		String staticStr="";
		Character[] chars = new Character[26];
		int n=5;//for replace char next letter interval
		char letter = 'a';
		for (int i = 0; i < chars.length; i++) {
			chars[i]= letter;
			staticStr+=letter+"";
			letter++;
		}
		System.out.println("chars list: "+Arrays.toString(chars));
		
		//process input string 
		System.out.println("Input String:"+input);
		StringBuilder sb = new StringBuilder();
		List<Character> charStatic = Arrays.asList(chars);
		for (char c : input.toCharArray()) {
			if(charStatic.contains(c)) {
				int index = staticStr.indexOf(c);
				int nextIndex = index+n;
				if(nextIndex>25) {
					nextIndex = nextIndex-25-1;
				}
				sb.append(chars[nextIndex]);
			}else {
				sb.append(c);
			}
		}
		System.out.println("Output String:"+sb.toString());
		

	}

}
