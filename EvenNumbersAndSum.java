package question;
import java.util.Scanner;

public class EvenNumbersAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer (n): ");
        int n = scanner.nextInt();

        System.out.println("Value of n: " + n);

        if (n % 2 == 0) {
            System.out.println(n + " is an even number.");
        } else {
            System.out.println(n + " is an odd number.");
        }

        System.out.println("\nFinding even numbers from 1 to " + n + ":");

        int sumOfEvens = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is even.");
                sumOfEvens = sumOfEvens + i;
            }
        }

        System.out.println("\nThe sum of all even numbers from 1 to " + n + " is: " + sumOfEvens);

        scanner.close();
    }
}