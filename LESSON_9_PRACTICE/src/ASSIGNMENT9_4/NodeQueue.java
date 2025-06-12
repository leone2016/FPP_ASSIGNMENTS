package prog9_4_startup;

public class NodeQueue {
	/* stores the element at the front of the queue, if it exists */
	private Node head;

	/* stores the element at the end of the queue, if it exists */
	private Node tail;

	/**
	 * Inserts a new node containing s at end of queue
	 */
	public void enqueue(String s) {
		Node newNode = new Node();
		newNode.data = s;
		if (isEmpty()) {
			head = tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
	}

	/**
	 * Removes node from the front of the queue and returns its value
	 */
	public String dequeue() throws QueueException {
		if (isEmpty()) throw new QueueException("Queue is empty!");
		String value = head.data;
		head = head.next;
		if (head == null) tail = null; // If queue is now empty, reset tail
		return value;
	}

	/**
	 * Returns value stored at the front of the queue
	 */
	public String peek() throws QueueException {
		if (isEmpty()) throw new QueueException("Queue is empty!");
		return head.data;
	}

	public boolean isEmpty() {
		return head == null;
	}

	@Override
	public String toString() {
		if (isEmpty()) return "<empty queue>";
		return head.toString();
	}
}


