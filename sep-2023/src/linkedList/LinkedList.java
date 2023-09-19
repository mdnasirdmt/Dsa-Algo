package linkedList;

public class LinkedList {

	public static Node head;
	public static Node tail;

	public static class Node {
		Integer data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}

	}
	
	static void addNode(Node node) {
		LinkedList ll = new LinkedList();
		ll.head = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);

		ll.head.next = n2;
		n2.next = n3;
	}

//	print linked List value
	static void print(Node head) {

		Node h = head;
		if (h == null) {
			System.out.println("linked list empty ");
		}
		while (h != null) {
			System.out.print(h.data + " ");
			h = h.next;
		}

	}

	public static void main(String[] args) {
		addNode(head);

		print(head);
	}

}
