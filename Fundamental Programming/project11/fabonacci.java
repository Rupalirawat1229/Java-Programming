import java.util.Scanner;

public class fabonacci {

        // Recursive method to calculate the nth Fibonacci number
        public static int fibonacci(int n) {
            // Base cases: if n is 0, return 0; if n is 1, return 1
            if (n == 0) {
                return 0;
            } else if (n == 1) {
                return 1;
            } else {
                // Recursive case: sum of the two preceding numbers
                return fibonacci(n - 1) + fibonacci(n - 2);
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a positive integer: ");
            int number = scanner.nextInt();

            // Check if the input is valid
            if (number < 0) {
                System.out.println("Please enter a positive integer.");
            } else {
                int result = fibonacci(number);
                System.out.println("The " + number + "th Fibonacci number is: " + result);
            }

            scanner.close();
        }
    }

