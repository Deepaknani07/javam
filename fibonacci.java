import java.util.HashMap;

public class FibonacciMemoization {
    // HashMap to store previously computed Fibonacci numbers
    private static HashMap<Integer, Long> memo = new HashMap<>();

    // Function to compute Fibonacci using memoization
    public static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        // Check if the value is already computed
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        // Compute and store the result in the HashMap
        long result = fibonacci(n - 1) + fibonacci(n - 2);
        memo.put(n, result);
        return result;
    }

    // Main function to test Fibonacci
    public static void main(String[] args) {
        int n = 10; // Example input
        System.out.println("Fibonacci of " + n + " is: " + fibonacci(n));
    }
}
