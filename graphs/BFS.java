package graphs;

import java.util.*;

public class BFS {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        graph.add(new ArrayList<>(Arrays.asList(1, 2)));
        graph.add(new ArrayList<>(Arrays.asList(0, 3, 4)));
        graph.add(new ArrayList<>(Arrays.asList(0, 5)));
        graph.add(new ArrayList<>(Arrays.asList(1)));
        graph.add(new ArrayList<>(Arrays.asList(1)));
        graph.add(new ArrayList<>(Arrays.asList(2)));

        bfs(graph, 0);
    }

    public static void bfs(ArrayList<ArrayList<Integer>> graph, int start) {
        int n = graph.size(); // size of the graph

        boolean visited[] = new boolean[n];

        Queue<Integer> q = new LinkedList<>();

        q.offer(start);
        visited[start] = true;

        while (!q.isEmpty()) {
            int node = q.poll();
            System.out.print(node + " ");

            for (int neighbour : graph.get(node)) {
                if (!visited[neighbour]) {
                    q.offer(neighbour);
                    visited[neighbour] = true;
                }
            }
        }
    }
}
