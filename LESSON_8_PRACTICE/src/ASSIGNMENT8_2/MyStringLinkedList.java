package ASSIGNMENT8_2;

public class MyStringLinkedList {
	Node header;

	MyStringLinkedList() {
		header = new Node(null);
	}

	// Adds to the front of the list
	public void addFirst(String item) {
		Node n = new Node(item);
		n.next = header.next;
		n.previous = header;
		if (header.next != null) {
			header.next.previous = n;
		}
		header.next = n;
	}

	// Inserts a new Node containing data so that its position in the list is now pos
	void insert(String data, int pos) {
		if (header.next == null || pos == 0) {
			addFirst(data);
			return;
		}
		Node target = header.next;
		int index = 0;
		while (target != null && index < pos) {
			target = target.next;
			index++;
		}

		Node newNode = new Node(data);
		if (target == null) {
			// insert at end
			addLast(data);
		} else {
			newNode.next = target;
			newNode.previous = target.previous;
			if (target.previous != null) {
				target.previous.next = newNode;
			}
			target.previous = newNode;
		}
	}

	// Attempts to remove the first Node that contains data

	boolean remove(String data) {
		if (header.next == null) // empty list
			return false;

		Node target = header.next;

		while (target != null) {
			if (target.value.equals(data)) {
				Node prev = target.previous; // guaranteed non-null because of header
				Node next = target.next;

				prev.next = next;
				if (next != null) {
					next.previous = prev;
				}

				// If target is first node, update header.next
				if (target == header.next) {
					header.next = next;
				}
				return true;
			}
			target = target.next;
		}
		return false;
	}
	// Sorts the linked list using selection sort
	public void sort() {
		Node i = header.next;
		while (i != null) {
			Node j = minNode(i);
			swap(i, j);
			i = i.next;
		}
	}

	// Returns the node with the minimum value from node n to the end
	private Node minNode(Node n) {
		Node min = n;
		Node curr = n.next;
		while (curr != null) {
			if (curr.value.compareTo(min.value) < 0) {
				min = curr;
			}
			curr = curr.next;
		}
		return min;
	}

	// Swaps the values in two nodes
	private void swap(Node n1, Node n2) {
		String temp = n1.value;
		n1.value = n2.value;
		n2.value = temp;
	}

	// Adds a node to the end of the list
	public void addLast(String item) {
		Node n = new Node(item);
		Node last = header;
		while (last.next != null) {
			last = last.next;
		}
		last.next = n;
		n.previous = last;
	}

	// Removes the last node
	public void removeLast() {
		if (header.next == null) return;
		Node current = header;
		while (current.next != null) {
			current = current.next;
		}
		Node previous = current.previous;
		previous.next = null;
		current.previous = null;
	}

	// Searches for a string in the list
	public boolean search(String s) {
		Node next = header.next;
		while (next != null && !next.value.equals(s)) {
			next = next.next;
		}
		return next != null;
	}

	public String toString() {
		var sb = new StringBuffer();
		Node next = header.next;
		while (next != null) {
			sb.append(next.toString()).append(", ");
			next = next.next;
		}
		var result = sb.toString().trim();
		if (result.length() == 0) return "<empty list>";
		if (result.charAt(result.length() - 1) == ',') {
			return result.substring(0, result.length() - 1);
		}
		return result;
	}

	// Inner Node class
	class Node {
		String value;
		Node next;
		Node previous;

		Node(String value) {
			this.value = value;
		}

		public String toString() {
			return value == null ? "null" : value;
		}
	}

	// Main method for testing all functionalities
	public static void main(String[] args) {
		var list = new MyStringLinkedList();
		list.addLast("Rich");
		System.out.println(list);
		list.removeLast();
		System.out.println(list);
		list.addFirst("Bob");
		list.addFirst("Harry");
		list.addFirst("Steve");
		System.out.println(list);
		list.removeLast();
		System.out.println(list);
		System.out.println("search(Harry): " + list.search("Harry"));
		System.out.println("search(Bob): " + list.search("Bob"));
		list.addLast("Tom");
		System.out.println(list);
		System.out.println("Inserting element M at position 1");
		list.insert("M", 1);
		System.out.println(list);
		System.out.println("Removing the first node: " + list.remove("Steve"));


		// Sort test
		System.out.println("\n-- Now testing sort() --");

		MyStringLinkedList sortList = new MyStringLinkedList();

		String[] testWords = {
				"big", "small", "tall", "short", "round", "square",
				"enormous", "tiny", "gargantuan", "lilliputian",
				"numberless", "none", "vast", "miniscule"
		};

		for (String word : testWords) {
			sortList.addLast(word);
		}

		System.out.println("Before sort:");
		System.out.println(sortList);

		sortList.sort();

		System.out.println("After sort:");
		System.out.println(sortList);
	}
}



