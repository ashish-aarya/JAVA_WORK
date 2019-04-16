package L25;

import java.awt.List;
import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

import L23.Car;

public class HeapGcClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HeapGeneric<Car> heapgc = new HeapGeneric<>();
		Car[] c = new Car[5];
		c[0] = new Car(1000, 20, "BLACK");
		c[1] = new Car(10, 2, "RED");
		c[2] = new Car(500, 30, "Blue");
		c[3] = new Car(1080, 10, "Greeb");
		c[4] = new Car(140, 80, "White");
		heapgc.add(c[0]);
		heapgc.add(c[1]);
		heapgc.add(c[2]);
		heapgc.add(c[3]);
		heapgc.add(c[4]);
		// heapgc.add(c[0]);
		heapgc.display();
		while (!heapgc.isEmpty())
			System.out.println(heapgc.remove());
		ArrayList<ArrayList<Integer>> lists = new ArrayList<>();

		lists.add(new ArrayList<>());
		lists.add(new ArrayList<>());
		lists.add(new ArrayList<>());
		lists.add(new ArrayList<>());

		lists.get(0).add(1);
		lists.get(0).add(8);
		lists.get(0).add(9);
		lists.get(0).add(10);
		lists.get(0).add(12);

		lists.get(1).add(5);
		lists.get(1).add(15);
		lists.get(1).add(20);

		lists.get(2).add(7);
		lists.get(2).add(13);
		lists.get(2).add(25);
		lists.get(2).add(30);

		lists.get(3).add(2);
		lists.get(3).add(3);

		System.out.println(lists);

		System.out.println(mergeKSortedLists(lists));

		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(10);
		arr.add(20);
		arr.add(3);
		arr.add(4);
		arr.add(9);
		arr.add(80);

		System.out.println(kLargestElements(arr, 3));

	}

	private static class Pair implements Comparable<Pair> {
		int data;
		int lev;
		int idx;

		@Override
		public int compareTo(Pair o) {
			// TODO Auto-generated method stub
			return -o.data + this.data;
		}
	}

	public static ArrayList<Integer> mergeKSortedLists(ArrayList<ArrayList<Integer>> lists) {
		ArrayList<Integer> res = new ArrayList<>();
		HeapGeneric<Pair> heap = new HeapGeneric<>();

		for (int i = 0; i < lists.size(); i++) {
			Pair np = new Pair();
			np.data = lists.get(i).get(0);
			np.lev = i;
			np.idx = 0;
			heap.add(np);
		}

		while (!heap.isEmpty()) {
			Pair rv = heap.remove();
			res.add(rv.data);
			rv.idx++;
			if (rv.idx < lists.get(rv.lev).size()) {
				rv.data = lists.get(rv.lev).get(rv.idx);
				heap.add(rv);
			}
		}
		return res;

	}

	public static ArrayList<Integer> kLargestElements(ArrayList<Integer> lists, int k) {
		ArrayList<Integer> ans = new ArrayList<>();
		Heap heap = new Heap();
		for (int i = 0; i < k; i++) {
			heap.add(lists.get(i));
		}
		for (int i = k; i < lists.size(); i++) {

			int smaller = heap.getHp();

			if (lists.get(i) > smaller) {
				heap.remove();
				heap.add(lists.get(i));
			}
		}

		while (!heap.isEmpty()) {
			ans.add(heap.remove());
		}
		return ans;
	}
}
