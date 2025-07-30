public class LEA {
    public static int largestElement(int[] arr, int n) {
        // Handle the case of an empty array.
        // According to common competitive programming constraints (n >= 1),
        // this case might not occur. However, it's good practice to consider.
        if (n == 0) {
            // Depending on problem requirements, you might return:
            // 1. Integer.MIN_VALUE (a very small number, if valid as a "largest" for an empty set)
            // 2. Throw an IllegalArgumentException (if an empty array is considered an invalid input)
            // For now, let's assume returning Integer.MIN_VALUE is an acceptable default.
            return Integer.MIN_VALUE;
        }

        // Initialize maxElement with the first element of the array.
        int maxElement = arr[0];

        // Iterate through the array starting from the second element (index 1).
        for (int i = 1; i < n; i++) {
            // If the current element is greater than maxElement, update maxElement.
            if (arr[i] > maxElement) {
                maxElement = arr[i];
            }
        }

        // After iterating through the entire array, maxElement will hold the largest value.
        return maxElement;
    }
}
//DIFFERENT METHOD
// by math.max method

 class ArrayMax {
    public static void main(String[] args) {
        int[] numbers = {10, 5, 20, 15, 25};

        // Handle empty array case
        if (numbers.length == 0) {
            System.out.println("The array is empty.");
            return;
        }

        // Initialize max with the first element of the array
        int max = numbers[0];

        // Iterate through the rest of the array and update max
        for (int i = 1; i < numbers.length; i++) {
            max = Math.max(max, numbers[i]);
        }

        System.out.println("The maximum value in the array is: " + max);
    }
}