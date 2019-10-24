package graphs;

import graphs.graph.Graph;

public class GraphTest {

    public static void main(String[] args) {

        Graph graph = new Graph();

        int[] ids = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        graph.addNodes(ids);

        graph.addEdge(1, 2);
        graph.addEdge(1, 5);

        graph.addEdge(2, 1);
        graph.addEdge(2, 5);
        graph.addEdge(2, 9);

        graph.addEdge(3, 5);
        graph.addEdge(3, 10);

        graph.addEdge(4, 5);
        graph.addEdge(4, 8);

        graph.addEdge(5, 1);
        graph.addEdge(5, 2);
        graph.addEdge(5, 3);
        graph.addEdge(5, 4);
        graph.addEdge(5, 7);

        graph.addEdge(6, 7);

        graph.addEdge(7, 5);
        graph.addEdge(7, 6);
        graph.addEdge(7, 8);
        graph.addEdge(7, 9);

        graph.addEdge(8, 4);
        graph.addEdge(8, 7);
        graph.addEdge(8, 10);

        graph.addEdge(9, 2);
        graph.addEdge(9, 7);

        graph.addEdge(10, 3);
        graph.addEdge(10, 8);

        System.out.println("=========== Graph Search DFS ============");
        final boolean hasPathDFS = GraphSearchDFS.hasPathDFS(graph, 1, 9);
        System.out.println(hasPathDFS);

        System.out.println("=========== Graph Search BFS ============");
        final boolean hasPathBFS = GraphSearchBFS.hasPathBFS(graph, 1, 9);
        System.out.println(hasPathBFS);
    }
}
