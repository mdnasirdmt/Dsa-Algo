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
		NodeCreation creation = new NodeCreation();
		creation.head = new Node(1);
		Node sec = new Node(3);
		Node th = new Node(5);
		Node fr = new Node(7);
		Node fif = new Node(8);

		head.next = sec;
		sec.next = th;
		th.next = fr;
		fr.next = fif;

		printNode(head);
		System.out.println();
		printLength(head);
		printMid(head);

	}

	// print node element
	private static void printNode(Node head1) {
		Node current = head1;

		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
	}

//		print length element
	private static void printLength(Node head2) {

		Node cur = head2;
		int c = 0;
		while (cur.next != null) {
			c++;
			cur = cur.next;
		}
		System.out.println("Length is : " + c);

	}

	// print mid
	private static void printMid(Node head3) {
		Node cur = head3;
		int c = 0;
		while (cur.next != null) {
			c++;
			cur = cur.next;
		}
		int mid = c / 2;
//		System.out.println(mid);
		
		
		Node cur1=head3;
		int i=0;
		while( i<mid) {
			
			cur1=cur1.next;
			i++;
		}
		
		System.out.println(cur1.data);

	}

}
