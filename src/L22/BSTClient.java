package L22;

public class BSTClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] in = { 10, 20, 30, 40, 50, 60, 70 };
		BST bst = new BST(in);
		bst.display();
		System.out.println(bst.size());
		System.out.println(bst.max());
		System.out.println(bst.ht());
		System.out.println(bst.find(30));
		bst.range(20, 60);
		System.out.println("");
		bst.printDec();
		// bst.replaceWithSumLarger();
		// bst.display();
		//bst.add(5);
		bst.display();
		bst.remove(40);
		bst.display();
	}

}
