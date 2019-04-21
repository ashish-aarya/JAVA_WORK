package L28;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.concurrent.SynchronousQueue;

public class Graph {
	private class Vertex {
		HashMap<String, Integer> nbrs = new HashMap<>();
	}

	HashMap<String, Vertex> vtces = new HashMap<>();

	public int numVertex() {
		return vtces.size();
	}

	public boolean containsVertex(String vname) {

		return vtces.containsKey(vname);

	}

	public void addVertex(String vname) {
		Vertex vtx = new Vertex();
		vtces.put(vname, vtx);

	}

	public void removeVertex(String vname) {
		Vertex vtx = vtces.get(vname);
		for (String nbr : vtx.nbrs.keySet()) {
			Vertex nbrVtx = vtces.get(nbr);
			nbrVtx.nbrs.remove(vname);
		}
		vtces.remove(vname);

	}

	public int numEdges() {
		ArrayList<String> keys = new ArrayList<>(vtces.keySet());
		int count = 0;
		for (String key : keys) {
			Vertex vtx = vtces.get(key);
			count = count + vtx.nbrs.size();
		}
		return count / 2;
	}

	public boolean containsEdge(String vname1, String vname2) {
		Vertex vtx1 = vtces.get(vname1);
		Vertex vtx2 = vtces.get(vname2);

		if (vtx1 == null || vtx2 == null || !vtx1.nbrs.containsKey(vname2)) {
			return false;
		}

		return true;
	}

	public void addEdge(String vname1, String vname2, int cost) {
		Vertex vtx1 = vtces.get(vname1);
		Vertex vtx2 = vtces.get(vname2);
		if (vtx1 == null || vtx2 == null || vtx1.nbrs.containsKey(vname2))
			return;
		vtx1.nbrs.put(vname2, cost);
		vtx2.nbrs.put(vname1, cost);
	}

	public void removeEdge(String vname1, String vname2) {
		Vertex vtx1 = vtces.get(vname1);
		Vertex vtx2 = vtces.get(vname2);
		if (vtx1 == null || vtx2 == null || !vtx1.nbrs.containsKey(vname2))
			return;
		vtx1.nbrs.remove(vname2);
		vtx2.nbrs.remove(vname1);

	}

	public void display() {
		System.out.println("---------------------");
		for (String key : vtces.keySet())
			System.out.println(key + " -> " + vtces.get(key).nbrs);
		System.out.println("---------------------");
	}

	private class Pair {
		String name;
		String psf;
		String color;
	}

	public boolean BFS(String src, String dst) {

		LinkedList<Pair> queue = new LinkedList<>();
		HashMap<String, Boolean> processed = new HashMap<>();

		// 1. make a pair and put in queue
		Pair sp = new Pair();
		sp.name = src;
		sp.psf = src;

		queue.addLast(sp);

		// 2. work till the queue is not empty
		while (!queue.isEmpty()) {

			// 2.1 remove the pair from queue
			Pair rp = queue.removeFirst();

			if (processed.containsKey(rp.name)) {
				continue;
			}

			// 2.2 processed
			processed.put(rp.name, true);

			// 2.3 direct edge
			if (containsEdge(rp.name, dst)) {
				System.out.println(rp.psf + dst);
				return true;
			}

			// 2.4 nbrs
			for (String nbr : vtces.get(rp.name).nbrs.keySet()) {

				// process only unprocessed nbrs
				if (!processed.containsKey(nbr)) {

					// make pair for nbr and put in queue
					Pair np = new Pair();
					np.name = nbr;
					np.psf = rp.psf + nbr;

					queue.addLast(np);
				}

			}

		}

		return false;

	}

	public boolean DFS(String src, String dst) {

		LinkedList<Pair> stack = new LinkedList<>();
		HashMap<String, Boolean> processed = new HashMap<>();

		// 1. make a pair and put in queue
		Pair sp = new Pair();
		sp.name = src;
		sp.psf = src;

		stack.addFirst(sp);

		// 2. work till the queue is not empty
		while (!stack.isEmpty()) {

			// 2.1 remove the pair from queue
			Pair rp = stack.removeFirst();

			if (processed.containsKey(rp.name)) {
				continue;
			}

			// 2.2 processed
			processed.put(rp.name, true);

			// 2.3 direct edge
			if (containsEdge(rp.name, dst)) {
				System.out.println(rp.psf + dst);
				return true;
			}

			// 2.4 nbrs
			for (String nbr : vtces.get(rp.name).nbrs.keySet()) {

				// process only unprocessed nbrs
				if (!processed.containsKey(nbr)) {

					// make pair for nbr and put in queue
					Pair np = new Pair();
					np.name = nbr;
					np.psf = rp.psf + nbr;

					stack.addFirst(np);
				}

			}

		}

		return false;

	}

	public void BFT() {

		LinkedList<Pair> queue = new LinkedList<>();
		HashMap<String, Boolean> processed = new HashMap<>();

		for (String key : vtces.keySet()) {
			// 1. make a pair and put in queue
			Pair sp = new Pair();
			sp.name = key;
			sp.psf = key;

			queue.addLast(sp);

			// 2. work till the queue is not empty
			while (!queue.isEmpty()) {

				// 2.1 remove the pair from queue
				Pair rp = queue.removeFirst();

				if (processed.containsKey(rp.name)) {
					continue;
				}

				// 2.2 processed
				processed.put(rp.name, true);
				System.out.println(rp.name + "-> " + rp.psf);
				// 2.3 direct edge

				// 2.4 nbrs
				for (String nbr : vtces.get(rp.name).nbrs.keySet()) {

					// process only unprocessed nbrs
					if (!processed.containsKey(nbr)) {

						// make pair for nbr and put in queue
						Pair np = new Pair();
						np.name = nbr;
						np.psf = rp.psf + nbr;

						queue.addLast(np);
					}

				}

			}
		}

	}

	public void DFT() {

		LinkedList<Pair> stack = new LinkedList<>();
		HashMap<String, Boolean> processed = new HashMap<>();

		for (String key : vtces.keySet()) {
			// 1. make a pair and put in queue
			Pair sp = new Pair();
			sp.name = key;
			sp.psf = key;

			stack.addFirst(sp);

			// 2. work till the queue is not empty
			while (!stack.isEmpty()) {

				// 2.1 remove the pair from queue
				Pair rp = stack.removeFirst();

				if (processed.containsKey(rp.name)) {
					continue;
				}

				// 2.2 processed
				processed.put(rp.name, true);
				System.out.println(rp.name + "-> " + rp.psf);
				// 2.3 direct edge

				// 2.4 nbrs
				for (String nbr : vtces.get(rp.name).nbrs.keySet()) {

					// process only unprocessed nbrs
					if (!processed.containsKey(nbr)) {

						// make pair for nbr and put in queue
						Pair np = new Pair();
						np.name = nbr;
						np.psf = rp.psf + nbr;

						stack.addFirst(np);
					}

				}

			}
		}

	}

	public boolean isCyclic() {

		LinkedList<Pair> queue = new LinkedList<>();
		HashMap<String, Boolean> processed = new HashMap<>();

		for (String key : vtces.keySet()) {
			// 1. make a pair and put in queue
			Pair sp = new Pair();
			sp.name = key;
			sp.psf = key;

			queue.addLast(sp);

			// 2. work till the queue is not empty
			while (!queue.isEmpty()) {

				// 2.1 remove the pair from queue
				Pair rp = queue.removeFirst();

				if (processed.containsKey(rp.name)) {
					return true;
				}

				// 2.2 processed
				processed.put(rp.name, true);
				// System.out.println(rp.name + "-> " + rp.psf);
				// 2.3 direct edge

				// 2.4 nbrs
				for (String nbr : vtces.get(rp.name).nbrs.keySet()) {

					// process only unprocessed nbrs
					if (!processed.containsKey(nbr)) {

						// make pair for nbr and put in queue
						Pair np = new Pair();
						np.name = nbr;
						np.psf = rp.psf + nbr;

						queue.addLast(np);
					}

				}

			}
		}
		return false;

	}

	public boolean isConnected() {
		int count = 0;
		LinkedList<Pair> queue = new LinkedList<>();
		HashMap<String, Boolean> processed = new HashMap<>();

		for (String key : vtces.keySet()) {
			// 1. make a pair and put in queue

			if (processed.containsKey(key)) {
				continue;
			}
			count++;
			Pair sp = new Pair();
			sp.name = key;
			sp.psf = key;

			queue.addLast(sp);

			// 2. work till the queue is not empty
			while (!queue.isEmpty()) {

				// 2.1 remove the pair from queue
				Pair rp = queue.removeFirst();

				if (processed.containsKey(rp.name)) {
					continue;
				}

				// 2.2 processed
				processed.put(rp.name, true);
				// System.out.println(rp.name + "-> " + rp.psf);
				// 2.3 direct edge

				// 2.4 nbrs
				for (String nbr : vtces.get(rp.name).nbrs.keySet()) {

					// process only unprocessed nbrs
					if (!processed.containsKey(nbr)) {

						// make pair for nbr and put in queue
						Pair np = new Pair();
						np.name = nbr;
						np.psf = rp.psf + nbr;

						queue.addLast(np);
					}

				}

			}
		}
		return count == 1;

	}

	public boolean isTree() {
		return isConnected() && !isCyclic();
	}

	public ArrayList<ArrayList<String>> getConnected() {
		ArrayList<ArrayList<String>> ans = new ArrayList<>();
		LinkedList<Pair> queue = new LinkedList<>();
		HashMap<String, Boolean> processed = new HashMap<>();

		for (String key : vtces.keySet()) {
			// 1. make a pair and put in queue
			Pair sp = new Pair();
			sp.name = key;
			sp.psf = key;

			queue.addLast(sp);
			ArrayList<String> subans = new ArrayList<>();

			// 2. work till the queue is not empty
			while (!queue.isEmpty()) {

				// 2.1 remove the pair from queue
				Pair rp = queue.removeFirst();

				if (processed.containsKey(rp.name)) {
					continue;
				}

				// 2.2 processed
				processed.put(rp.name, true);
				// System.out.println(rp.name + "-> " + rp.psf);
				// 2.3 direct edge
				subans.add(rp.name);
				// 2.4 nbrs
				for (String nbr : vtces.get(rp.name).nbrs.keySet()) {

					// process only unprocessed nbrs
					if (!processed.containsKey(nbr)) {

						// make pair for nbr and put in queue
						Pair np = new Pair();
						np.name = nbr;
						np.psf = rp.psf + nbr;

						queue.addLast(np);
					}

				}

			}
		}
		return ans;

	}

	public boolean biPertite() {
		LinkedList<Pair> queue = new LinkedList<>();
		HashMap<String, String> processed = new HashMap<>();

		for (String key : vtces.keySet()) {
			// 1. make a pair and put in queue
			Pair sp = new Pair();
			sp.name = key;
			sp.psf = key;
			sp.color = "r";

			queue.addLast(sp);

			// 2. work till the queue is not empty
			while (!queue.isEmpty()) {

				// 2.1 remove the pair from queue
				Pair rp = queue.removeFirst();

				if (processed.containsKey(rp.name)) {
					String oc = processed.get(rp.name);
					String nc = rp.color;
					if (!oc.equals(nc))
						return false;
				}

				// 2.2 processed
				processed.put(rp.name, rp.color);
				// System.out.println(rp.name + "-> " + rp.psf);
				// 2.3 direct edge

				// 2.4 nbrs
				for (String nbr : vtces.get(rp.name).nbrs.keySet()) {

					// process only unprocessed nbrs
					if (!processed.containsKey(nbr)) {

						// make pair for nbr and put in queue
						Pair np = new Pair();
						np.name = nbr;
						np.psf = rp.psf + nbr;

						queue.addLast(np);
					}

				}

			}
		}
		return false;
	}
}
