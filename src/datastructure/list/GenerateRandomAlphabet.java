package datastructure.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class GenerateRandomAlphabet {

	public static void main(String[] args) {
		int totalAlphabets=26;
		int loop = 26;
		
		System.out.print("[");
		while(loop-- > 0) {
			System.out.print((char) ('A' + (Math.random()*totalAlphabets))+ " - ");
			
		}
		System.out.println("]");
		
		//Random number
		int total =10;
		Random rand = new Random();
		int loop1=10;
		while(loop1-- >0) {
		System.out.print(rand.nextInt(total)+ " ");
		}
		
		//random using collection shuffle
		List<Integer> lst = new ArrayList<>();
		
		for (int i = 0; i < 10; i++) {
			lst.add(i+1);
		}
		System.out.println("\noriginal list:"+lst);
		Collections.shuffle(lst);
		System.out.println("Shuffled list:"+lst);
		
		//random using nextint
		Random random = new Random();
		int loop2=10;
		while(loop2-- >0){
			System.out.print(rand.nextInt(11)+ " ");
		}
		
		//random number using Random valuee generator
		int customNum=10;
		RandomValueGenerator generator = new RandomValueGenerator(customNum);
		int loop3=10;
		System.out.print("\nunique number generator:");
		while(loop3-- >0) {
			//System.out.print("loop:"+loop3+"-");
			System.out.print(+generator.getNext()+" ");
		}
		


	}

}
