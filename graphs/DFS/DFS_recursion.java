import java.util.*;

public class DFS_recursion {

    public static void dfs(int node, ArrayList<ArrayList<Integer>> graph, boolean[] visited) {

        visited[node] = true; // Mark the current node as visited
        System.out.print(node + " "); // Visit the node

        // Traverse all neighbours of the current node
        for (int neighbour : graph.get(node)) {

            if (!visited[neighbour]) {
                dfs(neighbour, graph, visited);
            }
        }
    }

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        graph.add(new ArrayList<>(Arrays.asList(1, 2)));
        graph.add(new ArrayList<>(Arrays.asList(3)));
        graph.add(new ArrayList<>(Arrays.asList(4)));
        graph.add(new ArrayList<>());
        graph.add(new ArrayList<>());

        boolean[] visited = new boolean[graph.size()];

        dfs(0, graph, visited);
    }
}