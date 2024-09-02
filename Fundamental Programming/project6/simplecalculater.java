import java.util.Scanner;
public class simplecalculater {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Prompt the user to enter the first number
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            // Prompt the user to enter the second number
            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            // Prompt the user to enter an operator (+, -, *, /)
            System.out.print("Enter an operator (+, -, *, /,%5645" +
                    "): ");
            char operator = scanner.next().charAt(0);

            double result;

            // Use a switch statement to perform the corresponding arithmetic operation
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    // Handle division by zero
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                        return;
                    }
                    break;
                default:
                    System.out.println("Error: Invalid operator!");
                    return;
            }

            // Display the result of the operation
            System.out.println("The result is: " + result);
        }
    }

