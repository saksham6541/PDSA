import java.util.*;

public class DFS_stack {
    public static void main(String[] args) {
        int V = 5;

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }

        // Undirected graph
        graph.get(0).add(1);
        graph.get(0).add(2);

        graph.get(1).add(0);
        graph.get(1).add(3);
        graph.get(1).add(4);

        graph.get(2).add(0);

        graph.get(3).add(1);

        graph.get(4).add(1);

        dfs(0, graph);
    }

    static void dfs(int start, ArrayList<ArrayList<Integer>> graph) {
        boolean[] visited = new boolean[graph.size()];
        Stack<Integer> stack = new Stack<>();

        stack.push(start);

        while (!stack.isEmpty()) {
            int node = stack.pop();

            if (!visited[node]) {
                visited[node] = true;
                System.out.print(node + " ");
            }

            for (int i = graph.get(node).size() - 1; i >= 0; i--) {
                int neighbour = graph.get(node).get(i);

                if (!visited[neighbour]) {
                    stack.push(neighbour);
                }
            }
        }
    }
}