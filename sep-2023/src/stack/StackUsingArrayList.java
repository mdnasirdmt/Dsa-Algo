package stack;

import java.util.ArrayList;
import java.util.Arrays;

public class StackUsingArrayList {

	public static class Stack {

		static ArrayList<Integer> list = new ArrayList<>();

//		 add data
		public static void push(int data) {
			list.add(data);
		}

//		 pop data
		public static int pop(int data) {
			if (list.isEmpty()) {
				return -1;
			}
			int top = list.get(list.size() - 1);
			list.remove(list.size() - 1);
			return top;
		}

//		 peek data
		public static int peek() {
			if (list.isEmpty()) {
				return -1;
			}
			int top = list.get(list.size() - 1);

			return top;
		}
	}

	public static void main(String[] args) {

		Stack stack = new Stack();

		stack.push(1);
		stack.push(2);
		stack.push(3);
		System.out.println(stack.list);

		System.out.println(stack.peek());

		System.out.println(stack.pop(1));

		System.out.println(stack.list);
	}

}
