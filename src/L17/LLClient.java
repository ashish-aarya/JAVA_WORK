package L17;

public class LLClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		LinkedList list = new LinkedList();
		list.addLast(10);
		list.addLast(20);
		list.addLast(30);
		list.addLast(40);
//		list.addLast(50);
		list.addLast(60);
		list.display();
//		System.out.println(list.getFirst());
//		System.out.println(list.getLast());
//		System.out.println(list.getAt(2));
//		list.display();
//		list.addFirst(60);
//		list.addLast(70);
//		list.display();
//		list.addAt(3, 200);
//		list.removeFirst();
//		list.display();
//		System.out.println(list.removeLast());
//		list.display();
//		list.removeAt(2);
//		list.display();
	    list.RDataIteratively();
		list.display();
		list.RPointerIteratively();
		list.display();
		list.RPointerRecursively();
		list.display();
		
	}

}
