package coding.interview.week04;

/**
 * 연결리스트 사용하여 스택 구현
 * @author sungyeon.jo
 */
public class StackUsingLinkedList {
	private Node head;
	private int size;

	public StackUsingLinkedList() {
		head = new Node(null);
		size = 0;
	}

	public void push(Object data) {
		Node newNode = new Node(data);
		newNode.next = head.next;
		head.next = newNode;

		size++;
	}

	public void pop() {
		if (size == 0) {
			throw new IndexOutOfBoundsException("no exist data");
		}

		Node targetNode = getNode(0);
		head.next = targetNode.next;

		size--;
	}

	public Object peek() {
		if (size == 0) {
			throw new IndexOutOfBoundsException();
		}

		return getNode(0).data;
	}

	public Node getNode(int index) {
		if (index >= size) {
			throw new IndexOutOfBoundsException();
		}

		Node node = head.next;

		for (int i = 0; i < index; i++) {
			node = node.next;
		}

		return node;
	}

	public Object get(int index) {
		return getNode(index).data;
	}

	private class Node {
		private Object data;
		private Node next;

		public Node(Object data) {
			this.data = data;
			this.next = null;
		}

		@Override
		public String toString() {
			return String.valueOf(this.data);
		}
	}

}
