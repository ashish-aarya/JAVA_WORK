package L17;

import java.util.concurrent.SynchronousQueue;

public class LinkedList {

	private class Node {
		int data;
		Node next;
	}

	private Node head;
	private Node tail;
	private int size;

	public int getFirst() throws Exception {
		if (this.size == 0)
			throw new Exception("LinkList is Empty");
		return this.head.data;
	}

	public int getLast() throws Exception {
		if (this.size == 0)
			throw new Exception("LinkList is Empty");
		return this.tail.data;
	}

	public int getAt(int k) throws Exception {
		if (this.size == 0)
			throw new Exception("LinkList is Empty");
		if (k < 0 || k >= this.size)
			System.out.println("Invalid Index");
		Node temp = this.head;
		for (int i = 1; i <= k; i++) {
			temp = temp.next;

		}

		return temp.data;
	}

	private Node getNodeAt(int k) throws Exception {
		if (this.size == 0)
			throw new Exception("LinkList is Empty");
		if (k < 0 || k >= this.size)
			System.out.println("Invalid Index");
		Node temp = this.head;
		for (int i = 1; i <= k; i++) {
			temp = temp.next;

		}

		return temp;
	}

	public void display() {
		System.out.println("_________________");

		Node temp = this.head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println(".");
		System.out.println("_________________");
	}

	public void addLast(int item) {
		Node nn = new Node();
		nn.data = item;
		nn.next = null;
		if (this.size > 0)
			this.tail.next = nn;
		if (this.size == 0) {
			this.head = nn;
			this.tail = nn;
			this.size++;
		} else {
			this.tail = nn;
			this.size++;
		}

	}

	public void addFirst(int item) {
		Node nn = new Node();
		nn.data = item;
		nn.next = null;

		nn.next = this.head;
		if (this.size == 0) {
			this.head = nn;
			this.tail = nn;
			this.size++;
		} else {
			this.head = nn;
			this.size++;
		}

	}

	public void addAt(int k, int item) throws Exception {
		if (k < 0 || k > this.size)
			throw new Exception("Invalid Index");
		if (k == 0)
			addFirst(item);
		else if (k == this.size)
			addLast(item);
		else {
			Node nn = new Node();
			nn.data = item;
			nn.next = null;
			Node nml = getNodeAt(k - 1);
			Node npl = nml.next;
			nml.next = nn;
			nn.next = npl;
			this.size++;
		}
	}

	public int removeFirst() throws Exception {
		if (this.size == 0)
			throw new Exception("LinkList is Empty");
		if (this.size == -1) {
			this.head = null;
			this.tail = null;
			this.size = 0;
		} else {
			this.head = this.head.next;
			this.size--;

		}
		return head.data;
	}

	public int removeLast() throws Exception {
		if (this.size == 0)
			throw new Exception("LinkList is Empty");
		
		int temp = tail.data ;
		if (this.size == 1) {
			this.head = null;
			this.tail = null;
			this.size = 0;
		} else {
			Node sm2 = getNodeAt(this.size - 2);
			sm2.next = null;
			this.tail = sm2;
			this.size--;
		}
		return temp;
	}

	public int removeAt(int k) throws Exception {
		if (k < 0 || k >= this.size) {
			throw new Exception("Invalid Index");
		}
		if (k == 0)
			return removeFirst();
		else if (k == this.size - 1)
			return removeLast();
		else {
			Node nml = getNodeAt(k - 1);
			Node n = nml.next;
			Node npl = n.next;
			nml.next = npl;
			this.size--;
			return nml.data;
		}

	}

	public void RDataIteratively() throws Exception { // Reverse Data Iteraively

		for (int i = 0, j = this.size - 1; i < this.size / 2; i++, j--) {
			int temp;
			// Node temp=new Node();
			Node vf = getNodeAt(i);
			Node vl = getNodeAt(j);
			temp = vf.data;
			vf.data = vl.data;
			vl.data = temp;

		}
	}

	public void RPointerIteratively() throws Exception {
		// Reverse Pointer Iteratively
		Node prev = this.head;
		Node curr = this.head.next;
		while (curr != null) {
			Node ahead = curr.next;
			curr.next = prev;
			prev = curr;
			curr = ahead;
		}
		Node temp = this.head;
		this.head = this.tail;
		tail = temp;
		this.tail.next = null;

	}

	private void RPointerRecursively(Node prev, Node curr) {
		// Reverse Pointer Recursively
		if (curr == null)
			return;
		RPointerRecursively(curr, curr.next);
		curr.next = prev;
	}

	public void RPointerRecursively() {
		RPointerRecursively(this.head, this.head.next);
		Node temp = this.head;
		this.head = this.tail;
		tail = temp;
		this.tail.next = null;
	}
}
