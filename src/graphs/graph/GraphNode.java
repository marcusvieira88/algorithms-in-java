package graphs.graph;

import java.util.LinkedList;

public class GraphNode {

    private int id;
    private LinkedList<GraphNode> adjacents = new LinkedList<>();

    public GraphNode(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LinkedList<GraphNode> getAdjacents() {
        return adjacents;
    }

    public void setAdjacents(LinkedList<GraphNode> adjacents) {
        this.adjacents = adjacents;
    }
}
