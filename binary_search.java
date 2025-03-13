class BinarySearch {
    // Iterative Binary Search Method
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2; // Prevents integer overflow
            
            if (arr[mid] == target)
                return mid; // Target found
            else if (arr[mid] < target)
                left = mid + 1; // Search right half
            else
                right = mid - 1; // Search left half
        }
        
        return -1; // Element not found
    }

    // Main method for testing
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15};
        
        System.out.println("Finding 7 in array: " + binarySearch(arr, 7)); // Output: 3
        System.out.println("Finding 10 in array: " + binarySearch(arr, 10)); // Output: -1 (Not found)
    }
}
