import java.util.*;

public class BFSGraph {
    // Function to perform BFS
    public static void bfs(Map<Character, List<Character>> graph, char start) {
        Set<Character> visited = new HashSet<>();  // Set to track visited nodes
        Queue<Character> queue = new LinkedList<>(); // Queue for BFS

        queue.add(start);
        visited.add(start);

        while (!queue.isEmpty()) {
            char vertex = queue.poll();  // Remove first element from queue
            System.out.print(vertex + " ");

            // Process all adjacent nodes
            for (char neighbor : graph.get(vertex)) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {
        // Define the graph using an adjacency list
        Map<Character, List<Character>> graph = new HashMap<>();
        graph.put('A', Arrays.asList('B', 'C'));
        graph.put('B', Arrays.asList('A', 'D', 'E'));
        graph.put('C', Arrays.asList('A', 'F', 'G'));
        graph.put('D', Arrays.asList('B'));
        graph.put('E', Arrays.asList('B'));
        graph.put('F', Arrays.asList('C'));
        graph.put('G', Arrays.asList('C'));

        // Perform BFS from node 'A'
        System.out.println("BFS Traversal:");
        bfs(graph, 'A');
    }
}
