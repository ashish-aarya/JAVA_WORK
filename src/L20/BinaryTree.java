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

	public BinaryTree(int[] pre, int[] in) {
		this.root = construct(pre, 0, pre.length - 1, in, 0, in.length - 1);
	}

	private Node construct(int[] pre, int plo, int phi, int[] in, int ilo, int ihi) {
		Node nn = new Node();
		int si = -1;
		if (plo > phi || ilo > ihi)
			return null;
		for (int i = ilo; i <= ihi; i++) {
			if (pre[plo] == in[i])
				si = i;
		}

		nn.data = pre[plo];
		int nel = si - ilo;
		nn.left = construct(pre, plo + 1, plo + nel, in, ilo, si - 1);
		nn.right = construct(pre, plo + nel + 1, phi, in, si + 1, ihi);
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

	private class DiaPair {
		int ht = -1;
		int dia = 0;

	}

	public int diameter2() {
		return diameter2(this.root).dia;
	}

	private DiaPair diameter2(Node node) {
		if (node == null) {
			DiaPair nw = new DiaPair();
			return nw;
		}
		DiaPair ldp = diameter2(node.left);
		DiaPair rdp = diameter2(node.right);

		DiaPair sdp = new DiaPair();
		sdp.ht = Math.max(ldp.ht, rdp.ht) + 1;

		int ldt = ldp.dia;
		int rdt = rdp.dia;
		int sp = ldp.ht + rdp.ht + 2;
		sdp.dia = Math.max(sp, Math.max(ldt, rdt));

		return sdp;
	}

	public boolean isBalanced() {
		return isBalanced(this.root);
	}

	private boolean isBalanced(Node node) {
		if (node == null)
			return true;
		boolean lfs = isBalanced(node.left);
		boolean rfs = isBalanced(node.right);
		int lf = ht(node.left);
		int rt = ht(node.right);
		int cal = lf - rt;
		if ((cal == 1 || cal == 0 || cal == -1) && lfs && rfs)
			return true;
		else
			return false;
	}

	private class BalPair {
		boolean isBalpair = true;
		int ht = -1;
	}

	public boolean isBalanced2() {
		return isBalanced2(this.root).isBalpair;
	}

	private BalPair isBalanced2(Node node) {
		if (node == null)
			return new BalPair();
		BalPair lfs = isBalanced2(node.left);
		BalPair rfs = isBalanced2(node.right);
		BalPair bp = new BalPair();
		int lh = lfs.ht;
		int rh = rfs.ht;
		int cal = lh - rh;
		bp.ht = Math.max(lh, rh) + 1;
		if ((cal == 1 || cal == 0 || cal == -1) && lfs.isBalpair && rfs.isBalpair)
			bp.isBalpair = true;
		else
			bp.isBalpair = false;
		return bp;
	}

	public int sum() {
		return sum(this.root);
	}

	private int sum(Node node) {
		if (node == null)
			return 1;

		int lf = sum(node.left);
		int sf = sum(node.right);

		int sum = lf + sf;
		return sum;
	}

	public void preOrder() {
		preOrder(this.root);
	}

	private void preOrder(Node node) {
		// TODO Auto-generated method stub
		if (node == null)
			return;
		// Node
		System.out.print(node.data + " ");
		// Left
		preOrder(node.left);
		// right
		preOrder(node.right);

	}

	public void postOrder() {
		postOrder(this.root);
	}

	private void postOrder(Node node) {
		// TODO Auto-generated method stub
		if (node == null)
			return;
		// Left
		postOrder(node.left);
		// right
		postOrder(node.right);

		// Node
		System.out.print(node.data + " ");

	}

	public void inOrder() {
		inOrder(this.root);
	}

	private void inOrder(Node node) {
		// TODO Auto-generated method stub
		if (node == null)
			return;
		// Left
		inOrder(node.left);
		// Node
		System.out.print(node.data + " ");
		// right
		inOrder(node.right);

	}

	private class Pair {
		Node node;
		boolean sd;
		boolean ld;
		boolean rd;
	}

	public void preOrderI() {
		LinkedList<Pair> stack = new LinkedList<>();
		Pair ps = new Pair();
		ps.node = this.root;
		stack.add(ps);

		while (!stack.isEmpty()) {

			Pair tp = stack.peek();

			if (tp.sd == false) {
				System.out.print(tp.node.data + " ");
				tp.sd = true;
			} else if (tp.ld == false) {
				Pair np = new Pair();
				np.node = tp.node.left;
				if (np.node != null)
					stack.push(np);

				tp.ld = true;

			} else if (tp.rd == false) {
				Pair np = new Pair();
				np.node = tp.node.right;
				if (np.node != null)
					stack.push(np);

				tp.rd = true;

			} else {
				stack.pop();
			}

		}
	}

	private class BSTPair {
		boolean isBST=true;;
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
	}

	public boolean isTreeBST() {
		return isTreeBST(this.root).isBST;

	}

	private BSTPair isTreeBST(Node node) {
		if (node == null)
			return new BSTPair();
		BSTPair lp = isTreeBST(node.left);
		BSTPair rp = isTreeBST(node.right);
		BSTPair sp = new BSTPair();
		sp.max = Math.max(node.data, Math.max(lp.max, rp.max));
		sp.min = Math.min(node.data, Math.min(lp.min, rp.min));
		if (lp.isBST&&rp.isBST&&node.data>lp.max&&node.data<rp.min)
			sp.isBST=true;
		else 
			sp.isBST=false;
		return sp;
	}
}
