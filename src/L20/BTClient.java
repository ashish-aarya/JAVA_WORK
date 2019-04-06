package L20;


// 10 true  20 true 40 false false true 50 false false  true 30 false true 60 false false
//10 true  20 true 400 false false true 50 false false  true 30 false true 60 false false
//10 true 20 false true 50 true 80 false false true 90 false false true 40 true 60 false false true 70 false false 
//10 true 20 false false false 
public class BTClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] pre={10,20,40,50,70,30,60};
		int[] in={40,20,50,70,10,30,60};
		BinaryTree bt = new BinaryTree(pre,in);
		bt.display();
		System.out.println(bt.size());
		System.out.println(bt.max());
		System.out.println(bt.ht());
		System.out.println(bt.find(6));
		System.out.println(bt.diameter());
		System.out.println(bt.diameter2());
		System.out.println(bt.isBalanced());
		System.out.println(bt.isBalanced2());
		//System.out.println(bt.sum());
		bt.preOrder();
		System.out.println("");
		bt.preOrderI();

	}

}
