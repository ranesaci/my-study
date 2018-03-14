package datastructure;

public class Node {

	int data;
	Node next;
	
	Node(int data){
		this.data=data;
	}
	Node(int x, Node next){//for linked list elements in the ascending order
		this.data=x;
		this.next=next;
	}
	
	/*public void insert(int x, Node start) {//adding for linked list elements in the ascending order
		Node p = start;
		while (p.next!= null) {
			if(p.next.data > x) {
				break;
			}
			p=p.next;
			
		}
		//add here element using other constructor
		p.next = new Node(x,p.next);
		
	}*/
	
	
}
