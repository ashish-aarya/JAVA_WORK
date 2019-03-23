package L16;

import L15.Stack2;

public class DynamicStack extends Stack2 {

	@Override
	public void push(int item) throws Exception {
		if (isfull()) {
			int[] na = new int[2 * this.data.length];
			for (int i = 0; i <= this.top; i++) {
				na[i] = data[i];
			}
			this.data = na;
		}
		super.push(item);

	}
}
