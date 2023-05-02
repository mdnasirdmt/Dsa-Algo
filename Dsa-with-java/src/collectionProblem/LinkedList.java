package collectionProblem;

public class LinkedList {

	static Node head; // head of list

	/*
	 * Linked list Node. This inner class is made static so that main() can access
	 * it
	 */
	static class Node {

		int data;
		Node next;

		Node(int d) {
			this.data = d;
			next = null;
		} // Constructor
	}

	/*
	 * This function prints contents of linked list starting from head
	 */
	public static void printList() {
		Node n = head;
		while (n != null) {
			System.out.print(n.data + " ");
			n = n.next;
		}
	}

	// Driver's code
	public static void main(String[] args) {
		/* Start with the empty list. */
		LinkedList llist = new LinkedList();

		llist.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node frth= new Node(4);

		llist.head.next = second; // Link first node with
									// the second node
		second.next = third; // Link second node with the third node

		third.next=frth;
		// Function call
        printList();
	}
}
