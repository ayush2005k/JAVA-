import java.util.*;

public class L3N {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        System.out.println("Value of a is: " + a); /
        int b = scanner.nextInt();
        System.out.println("Value of b is: " + b); 
        int c = scanner.nextInt();
        System.out.println("Value of c is: " + c); 

        int maxAB = Math.max(a, b);

        int largestNumber = Math.max(maxAB, c);

        System.out.println("max value is:" +  largestNumber);

        scanner.close();
    }
}

