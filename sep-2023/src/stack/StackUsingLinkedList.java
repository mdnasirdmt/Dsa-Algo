package stack;

public class StackUsingLinkedList {

	public static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public static class Stack {
		static Node head = null;

		static boolean isEmpty() {
			if (head == null) {
				return true;
			}
			return false;
		}

//		push data
		public static void push(int data) {

			Node node = new Node(data);
			if (isEmpty()) {
				head = node;
				return;
			}
			node.next = head;
			head = node;
		}

//		pop data 
		public static int pop() {
			if (isEmpty()) {
				return -1;
			}
			int top = head.data;
			head = head.next;

			return top;
		}

//		peek
		public static int peek() {
			if (isEmpty()) {
				return -1;
			}
			return head.data;
		}

	}

	public static void main(String[] args) {

		Stack stack = new Stack();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);

//		print stack data
		while (!stack.isEmpty()) {

			System.out.print(stack.peek() + " ");
			stack.pop();
		}

	}

}
