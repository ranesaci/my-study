package other;

import java.util.ArrayList;
import java.util.List;

public class OOMError {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<>();
		int count=0;
		while(true) {
			list.add(new String("fdfdfdffrfrfgrfgrgfrgfrgf"));
			System.out.println("added->"+count++);
		}

	}

}
