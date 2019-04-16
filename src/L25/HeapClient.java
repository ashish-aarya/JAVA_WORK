package L25;

public class HeapClient {
	public static void main(String[] args) {
		Heap heap = new Heap();
		heap.add(20);
		heap.display();
		heap.add(10);
		heap.display();
		heap.add(30);
		heap.display();
		heap.add(3);
		heap.display();
		heap.add(2);
		heap.display();
		while (!heap.isEmpty()) {
			heap.display();
			System.out.println(heap.remove());
		}
	}
}
