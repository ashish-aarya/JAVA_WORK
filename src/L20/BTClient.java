package L20;


// 10 true  20 true 40 false false true 50 false false  true 30 false true 60 false false
//10 true  20 true 400 false false true 50 false false  true 30 false true 60 false false
public class BTClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree bt = new BinaryTree();
		bt.display();
		System.out.println(bt.size());
		System.out.println(bt.max());
		System.out.println(bt.ht());
		System.out.println(bt.find(6));
		System.out.println(bt.diameter());
	}

}
