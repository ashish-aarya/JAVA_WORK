package L28;

public class GraphClient {

}package L28;

import java.util.HashMap;
import java.util.concurrent.SynchronousQueue;

public class GraphClient {

	public static void main(String[] args) {
		Graph graph = new Graph();
		// Graph graph = new Graph();
		graph.addVertex("A");
		graph.addVertex("B");
		graph.addVertex("C");
		graph.addVertex("D");
		graph.addVertex("E");
		graph.addVertex("F");
		graph.addVertex("G");
		graph.addEdge("A", "B", 2);
		graph.addEdge("A", "D", 10);
		graph.addEdge("B", "C", 3);
		graph.addEdge("C", "D", 1);
		graph.addEdge("D", "E", 8);
		graph.addEdge("E", "F", 5);
		graph.addEdge("E", "G", 6);
		graph.addEdge("F", "G", 4);
		graph.display();
		System.out.println(graph.BFS("A", "F"));
		System.out.println(graph.DFS("A", "F"));
		graph.BFT();
		graph.DFT();
		// graph.removeEdge("A", "F");
		System.out.println(graph.isCyclic());
		System.out.println(graph.isConnected());
		System.out.println(graph.biPertite());
	}
}
