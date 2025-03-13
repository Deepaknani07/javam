import java.util.*;

public class DFSRecursive {
    // Function to perform DFS
    public static void dfs(Map<Character, List<Character>> graph, char start, Set<Character> visited) {
        // Mark the current node as visited
        visited.add(start);
        System.out.print(start + " ");

        // Recur for all adjacent nodes
        for (char neighbor : graph.get(start)) {
            if (!visited.contains(neighbor)) {
                dfs(graph, neighbor, visited);
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

        // Set to keep track of visited nodes
        Set<Character> visited = new HashSet<>();

        // Perform DFS from node 'A'
        System.out.println("DFS Traversal:");
        dfs(graph, 'A', visited);
    }
}
