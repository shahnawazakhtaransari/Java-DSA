public class LinearSearch {

    public static int search(int[] arr, int target) {
        // Loop through every element in the array sequentially
        for (int i = 0; i < arr.length; i++) {
            // Check if the current element matches the target
            if (arr[i] == target) {
                return i; // Target found, return its index
            }
        }
        return -1; // Target not found in the array
    }

    public static void main(String[] args) {
        // Example unsorted array
        int[] numbers = {45, 12, 89, 7, 34, 23};
        int targetValue = 7;

        // Execute the search
        int resultIndex = search(numbers, targetValue);

        // Display results
        if (resultIndex != -1) {
            System.out.println("Element " + targetValue + " found at index: " + resultIndex);
        } else {
            System.out.println("Element " + targetValue + " not found in the array.");
        }
    }
}
