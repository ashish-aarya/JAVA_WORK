package L15;

public class Stack {
	private int[] data;
	private int top;

	public Stack() {
		this.data = new int[5];
		this.top = -1;
	}

	public Stack(int cap) {
		this.data = new int[cap];
		this.top = -1;
	}

	public void push(int item) throws Exception {
		if (isfull()) {
			throw new Exception("Satck is full");
		}
		this.top++;
		this.data[this.top] = item;

	}

	public int pop() throws Exception {
		if (isempty()) {
			throw new Exception("Satck is empty");
		}
		int rv = this.data[this.top];
		this.top--;
		return rv;
	}

	public int peek() throws Exception {
		if (isempty()) {
			throw new Exception("Satck is empty");
		}
		int rv = this.data[this.top];
		return rv;

	}

	public int size() {
		return this.top + 1;
	}

	public boolean isfull() {

		return this.size() == this.data.length;
	}

	public boolean isempty() {

		return this.size() == 0;
	}

	public void display() {
		for (int i = this.top; i >= 0; i--)
			System.out.print(this.data[i]+" ");
		System.out.println( );
	}
}
