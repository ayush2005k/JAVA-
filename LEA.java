public class LEA {
    public static int largestElement(int[] arr, int n) {
        /
        if (n == 0) {
            
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
