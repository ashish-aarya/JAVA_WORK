package L16;

import java.util.concurrent.SynchronousQueue;

public class DQClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DynamicQueue dq = new DynamicQueue();
		dq.enqueue(10);
		dq.enqueue(20);
		dq.enqueue(30);
		dq.enqueue(40);
		dq.enqueue(50);
		dq.display();
		// q.enqueue(60);
		System.out.println(dq.dequeue());
		dq.enqueue(70);
		dq.enqueue(80);
		dq.display();
		System.out.println("\n\n    disp");
		displayReverse(dq, 0);
		System.out.println("\n org");
		dq.display();
	 actualReverse(dq);
		//System.out.println("\n Again");
		System.out.println("\n org");
		dq.display();

	}

	public static void displayReverse(DynamicQueue Queue,int count) throws Exception {
		if (count==Queue.size()) {
			return;
		}
		int n = Queue.dequeue();
		Queue.enqueue(n);
		displayReverse(Queue,count+1);
		System.out.print(n+" ");
	}

	public static void actualReverse(DynamicQueue Queue) throws Exception {
		if (Queue.isEmpty()) {
			return;
		}
		int n = Queue.dequeue();

		actualReverse(Queue);
		Queue.enqueue(n);
	}

}
