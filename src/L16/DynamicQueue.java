package L16;

import L15.Queue2;

public class DynamicQueue extends Queue2 {
	@Override
	public void enqueue(int item) throws Exception {
		// TODO Auto-generated method stub
		if (isFull()) {
			int[] na = new int[2 * this.data.length];
			for (int i = 0; i < this.size; i++) {
				int idx = (i + this.front) % this.data.length;
				na[i] = data[idx];
			}
			this.data = na;
			this.front=0;
		}
		super.enqueue(item);
	}
	
}
