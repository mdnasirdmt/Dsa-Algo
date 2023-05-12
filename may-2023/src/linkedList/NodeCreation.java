package linkedList;

public class NodeCreation {

	static Node head;

	static class Node {

		Integer data;
		Node next;

		public Node(Integer i) {
			super();
			this.data = i;
			this.next = null;
		}

	}
	
	
	public static void main(String[] args) {
		NodeCreation creation=new NodeCreation();
		creation.head= new Node(1);
		Node sec=new Node(3);
		Node th= new Node(5);
		Node fr=new Node(7);
		
		head.next=sec;
		sec.next=th;
		th.next=fr;
		
		printNode();
		
	}


	private static void printNode() {
		Node current= head;
		
		while(current!=null) {
			System.out.print(current.data+" ");
			current=current.next;
		}
	}

}
