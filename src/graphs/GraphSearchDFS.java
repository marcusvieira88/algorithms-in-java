package graphs;

import graphs.graph.Graph;
import graphs.graph.GraphNode;
import java.util.HashSet;

/**
 * Depth-first search
 *
 * @author Marcus Vieira
 */
public class GraphSearchDFS {

    public static boolean hasPathDFS(Graph graph, int source, int destination) {
        GraphNode s = graph.getNode(source);
        GraphNode d = graph.getNode(destination);
        HashSet<Integer> visited = new HashSet<>();
        return hasPathDFS(s, d, visited);
    }

    private static boolean hasPathDFS(GraphNode source, GraphNode destination, HashSet<Integer> visited) {
        if (visited.contains(source.getId())) {
            return false;
        }

        visited.add(source.getId());
        System.out.println("visited=" + source.getId());
        if (source == destination) {
            return true;
        }

        for (GraphNode child : source.getAdjacents()) {
            if (hasPathDFS(child, destination, visited)) {
                return true;
            }
        }
        return false;
    }
}
