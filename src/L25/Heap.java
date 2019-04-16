package L25;

import java.util.ArrayList;

public class Heap {
	private ArrayList<Integer> data = new ArrayList<>();

	public int size() {
		return this.data.size();
	}

	public boolean isEmpty() {
		return this.size() == 0;
	}

	public void display() {
		System.out.println(data);
	}

	public void add(int item) {
		data.add(item);

		upheapify(this.size() - 1);
	}

	private void upheapify(int ci) {
		// TODO Auto-generated method stub
		int pi = (ci - 1) / 2;
		if (data.get(ci) < data.get(pi)) {
			swap(pi, ci);
			upheapify(pi);
		}
	}

	public void swap(int i, int j) {
		// TODO Auto-generated method stub
		int ith = data.get(i);
		int jth = data.get(j);
		data.set(i, jth);
		data.set(j, ith);

	}

	public int remove() {
		swap(0, data.size() - 1);
		int rv = data.remove(data.size() - 1);
		downheapify(0);
		return rv;
	}

	private void downheapify(int pi) {
		// TODO Auto-generated method stub
		int li = 2 * pi + 1;
		int ri = 2 * pi + 2;
		int mini = pi;
		if (li < data.size() && data.get(mini) > data.get(li))
			mini = li;
		if (ri < data.size() && data.get(mini) > data.get(ri))
			mini = ri;
		if (pi != mini) {
			swap(mini, pi);
			downheapify(mini);
		}

	}

	public int getHp() {
		return data.get(0);
	}
}
