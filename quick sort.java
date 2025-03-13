import java.util.Arrays;

public class QuickSort {
    // Function to perform Quick Sort
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Partition the array and get the pivot index
            int pivotIndex = partition(arr, low, high);
            // Recursively sort the left and right subarrays
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    // Partition function
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Choosing the last element as pivot
        int i = low; // Index for smaller elements

        // Loop through the array and place smaller elements to the left of pivot
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                swap(arr, i, j);
                i++;
            }
        }
        // Place the pivot element in its correct position
        swap(arr, i, high);
        return i;
    }

    // Swap two elements in the array
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Main function to test Quick Sort
    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        // Perform the Quick Sort
        quickSort(arr, 0, arr.length - 1);
        // Print the sorted array
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
