package L19;

import java.util.*;

public class GenericTree {
	Scanner scr = new Scanner(System.in);

	private class Node {
		int data;
		ArrayList<Node> children = new ArrayList<>();

	}

	private Node root;

	public GenericTree() {
		this.root = constructor(null, -1);
	}

	private Node constructor(Node parent, int ith) {
		// TODO Auto-generated method stub
		if (parent == null) {
			System.out.println("Enter The Data for the root Node ");
		} else
			System.out.println("Enter the data for " + ith + " child " + parent.data);
		int item = scr.nextInt();
		Node nn = new Node();
		nn.data = item;
		System.out.println("Number of child for the " + nn.data + " ?");
		int noc = scr.nextInt();
		for (int i = 0; i < noc; i++) {
			Node child = constructor(nn, i);
			nn.children.add(child);
		}
		return nn;
	}

	public void display() {
		display(this.root);
	}

	private void display(Node node) {
		// TODO Auto-generated method stub

		String str = node.data + "->";
		for (Node child : node.children)
			str += child.data + ",";
		str += ".";
		System.out.println(str);
		for (Node child : node.children)
			display(child);
		//
	}

	public int sizeofGt() {
		int s = sizeofGt(this.root);
		return s;
	}

	private int sizeofGt(Node node) {
		int ts = 0;
		for (Node child : node.children) {
			int cs = sizeofGt(child);
			ts += cs;
		}
		return ts + 1;

	}

	public int max() {
		return max(this.root);
	}

	private int max(Node node) {
		// TODO Auto-generated method stub
		int tc = node.data;
		for (Node child : node.children) {
			int cm = max(child);
			if (tc < cm)
				tc = cm;

		}
		return tc;
	}

	public boolean find(int item) {
		return find(this.root, item);
	}

	private boolean find(Node node, int item) {
		// TODO Auto-generated method stub
		if (node.data == item)
			return true;
		for (Node child : node.children) {
			boolean cf = find(child, item);
			if (cf)
				return true;

		}
		return false;
	}

	public int ht() {
		return ht(this.root);
	}

	private int ht(Node node) {
		int th = -1;
		for (Node child : node.children) {
			int ch = ht(child);
			if (th < ch) {
				th = ch;
			}
		}
		return th + 1;
	}

	public void mirror() {
		mirror(this.root);
	}

	private void mirror(Node node) {
		for (Node child : node.children)
			mirror(child);
		for (int i = 0, j = node.children.size() - 1; i < node.children.size() / 2; i++, j--) {
			{
				Node temp = node.children.get(i);
				Node temp2 = node.children.get(j);
				node.children.set(i, temp2);
				node.children.set(j, temp);

			}

		}

	}

	public void printAtLevels(int level) {
		printAtLevels(this.root, level, 0);
	}

	private void printAtLevels(Node node, int level, int cl) {
		if (cl == level)
			System.out.println(node.data);
		for (Node child : node.children) {
			printAtLevels(child, level, cl + 1);
		}

	}

	public void preorder() {
		preorder(this.root);
	}

	private void preorder(Node node) {
		System.out.println(node.data);

		for (Node child : node.children)
			preorder(child);
	}

	public void postorder() {
		postorder(this.root);
	}

	private void postorder(Node node) {

		for (Node child : node.children)
			postorder(child);
		System.out.println(node.data);
	}

	public void Levelorder() {

		LinkedList<Node> queue = new LinkedList<>();
		queue.addLast(this.root);
		while (!queue.isEmpty()) {
			Node rn = queue.removeFirst();
			System.out.println(rn.data + " ");
			for (Node child : rn.children)
				queue.addLast(child);
		}
		System.out.println();

	}
}