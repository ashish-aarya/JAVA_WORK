package L25;

import java.util.ArrayList;

import L24.Car;

public class HeapGeneric<T extends Comparable<T>> {
	private ArrayList<T> data = new ArrayList<>();

	public int size() {
		return this.data.size();
	}

	public boolean isEmpty() {
		return this.size() == 0;
	}

	public void display() {
		System.out.println(data);
	}

	public void add(T item) {
		data.add(item);

		upheapify(this.size() - 1);
	}

	private void upheapify(int ci) {
		// TODO Auto-generated method stub
		int pi = (ci - 1) / 2;
		if (isLarger(data.get(ci), data.get(pi)) > 0) {
			swap(pi, ci);
			upheapify(pi);
		}
	}

	public void swap(int i, int j) {
		// TODO Auto-generated method stub
		T ith = data.get(i);
		T jth = data.get(j);
		data.set(i, jth);
		data.set(j, ith);

	}

	public T remove() {
		swap(0, data.size() - 1);
		T rv = data.remove(data.size() - 1);
		downheapify(0);
		return rv;
	}

	private void downheapify(int pi) {
		// TODO Auto-generated method stub
		int li = 2 * pi + 1;
		int ri = 2 * pi + 2;
		int mini = pi;
		if (li < data.size() && isLarger(data.get(mini), data.get(li)) < 0)
			mini = li;
		if (ri < data.size() && isLarger(data.get(mini), data.get(ri)) < 0)
			mini = ri;
		if (pi != mini) {
			swap(mini, pi);
			downheapify(mini);
		}

	}

	public int isLarger(T t, T o) {
		return o.compareTo(t);
	}

}
