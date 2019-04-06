package L22;

public class BST {
	class Node {
		int data;
		Node left;
		Node right;
	}

	private static final HeapMover mover = null;

	private Node root;

	public BST(int[] in) {
		this.root = Constructor(in, 0, in.length - 1);

	}

	private Node Constructor(int[] in, int ilo, int ihi) {
		// TODO Auto-generated method stub
		if (ilo > ihi)
			return null;
		Node nn = new Node();

		int mid = (ilo + ihi) / 2;
		nn.data = in[mid];
		nn.left = Constructor(in, ilo, mid - 1);
		nn.right = Constructor(in, mid + 1, ihi);
		return nn;
	}

	public void display() {
		System.out.println("-------------");
		dispaly(this.root);
		System.out.println("-------------");
	}

	private void dispaly(Node node) {
		// TODO Auto-generated method stub
		if (node == null)
			return;

		String str = "";
		if (node.left == null)
			str += ".";
		else
			str += node.left.data + " ";

		str += " -> " + node.data + " <- ";
		if (node.right == null)
			str += ".";
		else
			str += node.right.data;

		System.out.println(str);
		dispaly(node.left);
		dispaly(node.right);

	}

	public int size() {
		return size(this.root);
	}

	private int size(Node node) {
		int ts = 0;
		if (node == null)
			return ts;
		// if (node.right == null)
		// return ts;

		int cs = size(node.left);
		ts += cs;
		cs = size(node.right);
		ts += cs;

		return ts + 1;
	}

	public int max() {
		return max(this.root);
	}

	private int max(Node node) {

		if (node.right == null)
			return node.data;

		int rs = max(node.right);
		return rs;
	}

	public boolean find(int item) {
		return find(this.root, item);
	}

	private boolean find(Node node, int item) {
		if (node == null)
			return false;
		if (node.data > item) {
			return find(node.left, item);
		} else if (node.data < item)

			return find(node.right, item);
		else
			return true;

	}

	public int ht() {
		return ht(this.root);
	}

	private int ht(Node node) {
		if (node == null)
			return -1;
		int ls = ht(node.left);
		int rs = ht(node.right);
		return Math.max(ls, rs) + 1;
	}

	public void range(int st, int en) {
		range(this.root, st, en);
	}

	private void range(Node node, int st, int en) {
		// TODO Auto-generated method stub
		if (node == null)
			return; // System.out.println(node.data);

		if (node.data < st) {

			range(node.left, st, en);
			// System.out.print(node.left.data + " ");
		} else if (node.data > en) {

			range(node.right, st, en);
			// System.out.print(node.right.data+" ");
		} else {
			range(node.left, st, en);
			System.out.print(node.data + " ");
			range(node.right, st, en);

		}

	}

	public void printDec() {
		printDec(this.root);
	}

	private void printDec(Node node) {
		if (node == null)
			return;
		// r
		printDec(node.right);
		// n
		System.out.print(node.data + " ");

		// l
		printDec(node.left);

	}

	private class HeapMover {
		int sum = 0;
	}

	public void replaceWithSumLarger() {

		// replaceWithSumLarger(this.root, 0);
		replaceWithSumLarger(this.root, new HeapMover());
	}

	private void replaceWithSumLarger(Node node, HeapMover mover) {
		// TODO Auto-generated method stub
		if (node == null)
			return;

		replaceWithSumLarger(node.right, mover);
		int temp = node.data;
		node.data = mover.sum;
		mover.sum += temp;
		replaceWithSumLarger(node.left, mover);
	}

	public int replaceWithSumLarger(Node node, int sum) {
		if (node == null)
			return sum;
		int right = replaceWithSumLarger(node.right, sum);
		int temp = node.data;
		node.data = right;
		// sum += temp;
		return replaceWithSumLarger(node.left, temp + right);
	}

	public void add(int item) {
		// add(this.root, item);
		this.root = addReturn(this.root, item);
	}

	private void add(Node node, int item) {
		// TODO Auto-generated method stub
		if (node == null)
			return;
		if (node.data > item) {
			if (node.left == null) {
				Node nn = new Node();
				nn.data = item;
				node.left = nn;

			} else {
				add(node.left, item);
			}

		} else {

			if (node.right == null) {
				Node nn = new Node();
				nn.data = item;
				node.right = nn;

			} else {
				add(node.right, item);

			}
		}
	}

	private Node addReturn(Node node, int item) {
		if (node == null) {
			Node nw = new Node();
			nw.data = item;
			return nw;
		}
		if (node.data > item)
			node.left = addReturn(node.left, item);
		else
			node.right = addReturn(node.right, item);
		return node;

	}
}
