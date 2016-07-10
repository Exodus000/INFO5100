
/*Design your own Stack, implement the following operations of a stack
 using queues.

push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
empty() -- Return whether the stack is empty.
Notes:
You must use only standard operations of a queue -- which means only push to back, peek/pop from front, size,
 and is empty operations are valid.
Depending on your language, queue may not be supported natively. You may simulate a queue by using a list or deque
 (double-ended queue), as long as you use only standard operations of a queue.
You may assume that all operations are valid (for example, no pop or top operations will be called on an empty stack).*/

import java.util.LinkedList;

class MyStack {
	LinkedList<Integer> q1 = new LinkedList<Integer>();
	LinkedList<Integer> q2 = new LinkedList<Integer>();
	LinkedList<Integer> toPop = null;

	// Push element x onto stack.
	public void push(int x) {
		if (toPop == q1) {
			q2.offer(q1.poll());
			q1.offer(x);
		} else if (toPop == q2) {
			q1.offer(q2.poll());
			q2.offer(x);
		} else {
			q1.offer(x);
			toPop = q1;
		}
	}

	// Removes the element on top of the stack.
	public void pop() {
		if (empty()) {
			return;
		}
		if (toPop == q1) {
			q1.poll();
			transit(q2, q1);
			toPop = q2;
		} else {
			q2.poll();
			transit(q1, q2);
			toPop = q1;
		}
	}

	// Get the top element.
	public int top() {
		return toPop.peek();
	}

	// Return whether the stack is empty.
	public boolean empty() {
		return (q1.size() + q2.size()) == 0;
	}

	public void transit(LinkedList<Integer> q1, LinkedList<Integer> q2) {
		while (!q1.isEmpty() && q1.size() != 1) {
			q2.offer(q1.poll());
		}
	}

	public static void main(String[] args) {

	}

}
