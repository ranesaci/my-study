package other;

import java.util.ArrayList;
import java.util.List;

public class ListSublist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<>();
		
		list.add("AA");
		list.add("BB");
		list.add("CC");
		list.add("DD");
		
		/*System.out.println(list.size());
		System.out.println(list.get(3));
		System.out.println(list.subList(2, 4));*/
		System.out.println("Reversed String "+reverse(list));

	}
	
	public static List<String> reverse(List<String> lst) {
		List<String> reversed = new ArrayList<>();
		if(lst.size()==1) {
			return lst;
		}
		
		reversed.add(lst.get(lst.size()-1));
		System.out.println(lst.get(lst.size()-1) + " --> last element taken");
		System.out.println("passing list to recursion "+ lst.subList(0, lst.size()-1));
		
		reversed.addAll(reverse(lst.subList(0, lst.size()-1)));
		return reversed;
		
		
	}

}
