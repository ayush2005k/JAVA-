public class fpn {
    public static void main(String[] args) {
        int a = 2;
        int b = 5;
        // Use Math.pow() for exponentiation.
        // Math.pow returns a double, so you might need to cast it to an int if desired,
        // but be aware of potential data loss if the result is very large.
        double cDouble = Math.pow(a, b);
        int c = (int) cDouble; // Cast to int if you want an integer result

        System.out.println(c);
    }
}

// different method
 class sol1 {
    public static void main(String[] args) {
        int a = 2; // The base
        int b = 6; // The exponent
        int result = 1; // Initialize the result to 1 (any number to the power of 0 is 1)

        // Loop 'b' times to multiply 'a' by itself
        for (int i = 0; i < b; i++) {
            result = result * a; // Multiply the current result by the base
        }

        System.out.println(result);
    }
}