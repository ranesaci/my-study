package datastructure;

public class SingleLinkedListDS {

	public static void main(String[] args) {
		
		Node start = new Node(11);
		Node p = start;//pointer for the traversing the linked list for add/delete/update
		
		//adding the elements in the list keeping pointer positions
		for (int i = 0; i < 4; i++) {
			p=p.next=new Node(22+11*i);
		}
		
		//iterate linked list
		for(p=start; p.next !=null; p=p.next) {
			System.out.println(p.data);
		}
		
		//add element in the linked list in order
		System.out.println("**add element in the linked list in order**");
		insert(23, start);
		insert(12, start);
		for(p=start; p.next !=null; p=p.next) {
			System.out.println(p.data);
		}
		
		
		

		
	}
	public static void insert(int x, Node start) {//adding for linked list elements in the ascending order
		Node p = start;
		while (p.next!= null) {
			if(p.next.data > x) {
				break;
			}
			p=p.next;
			
		}
		//add here element using other constructor
		p.next = new Node(x,p.next);
		
	}

}
