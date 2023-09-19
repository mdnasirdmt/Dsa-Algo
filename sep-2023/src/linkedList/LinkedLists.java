package linkedList;

import linkedList.LinkedList.Node;

public class LinkedLists {
	public static Node head;
	public static Node tail;

	public static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public static void main(String[] args) {
		LinkedLists ll = new LinkedLists();

		ll.addNode(1);
		ll.addNode(2);
		ll.addNode(3);

		print(head);

	}

//add value to linked list
	void addNode(int data) {

		Node n1 = new Node(data);
		if (head == null) {
			head = tail = n1;
			return;
		}
		n1.next = head;

		head = n1;

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

}
