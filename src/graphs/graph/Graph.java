package graphs.graph;

import java.util.HashMap;

public class Graph {

    private HashMap<Integer, GraphNode> graph = new HashMap<>();

    public void addNodes(int[] ids) {
        for (int id : ids) {
            addNode(id);
        }
    }

    public void addNode(int id) {
        GraphNode n = new GraphNode(id);
        graph.put(id, n);
    }

    public void addEdge(int source, int destination) {
        GraphNode s = getNode(source);
        GraphNode d = getNode(destination);
        s.getAdjacents().add(d);
    }

    public GraphNode getNode(int id) {
        return graph.get(id);
    }
}
