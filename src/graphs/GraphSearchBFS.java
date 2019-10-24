package graphs;

import graphs.graph.Graph;
import graphs.graph.GraphNode;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Breadth-first search
 *
 * @author Marcus Vieira
 */
public class GraphSearchBFS {

    public static boolean hasPathBFS(Graph graph, int source, int destination) {
        return hasPathBFS(graph.getNode(source), graph.getNode(destination));
    }

    private static boolean hasPathBFS(GraphNode source, GraphNode destination) {

        HashSet<Integer> visited = new HashSet<>();
        Queue<GraphNode> nextToVisit = new LinkedList<>();
        nextToVisit.add(source);

        while (!nextToVisit.isEmpty()) {
            GraphNode node = nextToVisit.remove();
            if (node == destination) {
                return true;
            }

            if (visited.contains(node.getId())) {
                continue;
            }

            visited.add(node.getId());
            System.out.println("visited=" + node.getId());
            for (GraphNode child : node.getAdjacents()) {
                nextToVisit.add(child);
            }
        }
        return false;
    }
}
