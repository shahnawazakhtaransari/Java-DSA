import java.util.Arrays;

public class BuiltInBinarySearch {
    public static void main(String[] args) {
        // The array MUST be sorted beforehand
        int[] numbers = {10, 20, 30, 40, 50}; 
        int target = 30;

        int index = Arrays.binarySearch(numbers, target);

        System.out.println("Element found at index: " + index); // Outputs 2
    }
}
