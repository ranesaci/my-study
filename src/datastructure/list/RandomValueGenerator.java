package datastructure.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomValueGenerator {
	
	private volatile List<Integer> list = new ArrayList<>();
	Random random = new Random();
			
	int maxNum;
	int staticVal=0;
	
	public RandomValueGenerator(int maxNum) {
		this.maxNum = maxNum;
		list.add(staticVal);
	}
	
	public int getNext() {
		int val = 0;
		
		while(list.contains(val)) {
			val=random.nextInt(maxNum+1);
			
		}
		list.add(val);
		return val;
		
		
				
	}

}
