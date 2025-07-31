import java.util.Arrays;

public class arraysort {
    // The method name is 'issortedarray'
    public static int issortedarray(int n, int[] array) {
        for (int i = 0; i < n - 1; i++) {
            if (array[i] > array[i + 1]) {
                return 0;
            }
        }
        return 1;
    }
    
    public static void main(String[] args) {
        int n1 = 5;
        int[] array1 = {1, 2, 3, 4, 5};
        System.out.println("Input: 'n' = " + n1 + ", 'a' = " + Arrays.toString(array1));

        // The method call is now corrected to 'issortedarray'
        System.out.println("Output: " + issortedarray(n1, array1)); 
    }
}
