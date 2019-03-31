package L19;

import java.util.concurrent.SynchronousQueue;

public class GenericTreeClient {
//10 3 20 2 50 0 60 0 30 0 40 2 70 0 80 0 
	//10 3 20 2 50 0 600 0 20 0 40 2 70 0 80 0 
	//10 3 20 2 50 0 60 1 100 0 30 0 40 2 70 0 80 0 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericTree gt = new GenericTree();
		//gt.constructor;
		System.out.println("-------------------------");
		gt.display();
		System.out.println("-------------------------");
		System.out.println(gt.sizeofGt());
		System.out.println(gt.max());
		System.out.println(gt.find(60));
		System.out.println(gt.ht());
		//gt.mirror();
		System.out.println("-------------------------");
		gt.display();
		System.out.println("-------------------------");
		//System.out.println(gt.printAtLevels(2));
		gt.printAtLevels(2);
		System.out.println("");
		gt.postorder();
		System.out.println("");
		gt.postorder();
		System.out.println("");
		gt.Levelorder();
		
		
		
	}

}
