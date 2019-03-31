package L20;

import java.util.*;

public class BinaryTree {
	Scanner scr = new Scanner(System.in);

	private class Node {
		int data;
		Node left;
		Node right;
	}

	private Node root;

	public BinaryTree() {
		this.root = constructor(null, false);
	}

	private Node constructor(Node parent, boolean ilc) {
		if (parent == null) {
			System.out.println("Enter the root");
		} else {
			if (ilc)
				System.out.println("Enter the Left Node for " + parent.data);
			else
				System.out.println("Enter the Right Node for " + parent.data);
		}

		int item = scr.nextInt();
		Node nn = new Node();
		nn.data = item;
		System.out.println("LEFT CHILD? ");
		boolean hlr = scr.nextBoolean();
		if (hlr) {
			nn.left = constructor(nn, true);
		}
		System.out.println("Right CHILD? ");
		boolean hrr = scr.nextBoolean();
		if (hrr) {
			nn.right = constructor(nn, false);
		}

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

		if (node == null)
			return Integer.MIN_VALUE;
		int ls = max(node.left);
		int rs = max(node.right);
		return Math.max(node.data, Math.max(ls, rs));
	}

	public boolean find(int item) {
		return find(this.root, item);
	}

	private boolean find(Node node, int item) {
		if (node == null)
			return false;
		if (node.data == item)
			return true;
		boolean ls = find(node.left, item);
		boolean rs = find(node.right, item);
		return ls || rs;

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

	public int diameter() {
		return diameter(this.root);
	}

	private int diameter(Node node) {
		if (node == null)
			return 0;
		int lt = diameter(node.left);
		int rt = diameter(node.right);
		int sp = ht(node.left) + ht(node.right) + 2;
		return Math.max(sp, Math.max(lt, rt));

	}

}
