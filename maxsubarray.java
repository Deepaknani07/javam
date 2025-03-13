public class MaxSubarraySum {
    // Function to find the maximum subarray sum
    public static int maxSubarraySum(int[] arr) {
        int maxSum = arr[0];   // Stores the maximum sum found so far
        int currentSum = arr[0]; // Stores the current subarray sum

        for (int i = 1; i < arr.length; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        
        int maxSum = maxSubarraySum(arr);
        System.out.println("Maximum Subarray Sum: " + maxSum);
    }
}
