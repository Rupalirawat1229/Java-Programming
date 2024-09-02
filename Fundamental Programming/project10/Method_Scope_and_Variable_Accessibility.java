public class Method_Scope_and_Variable_Accessibility {
        public static int sum(int a, int b) {
            return a + b;
        }
        public static int multiply(int a, int b) {

            return a * b;
        }
        public static void main(String[] args) {
            int result = sum(5, 10);
            System.out.println("The sum is: " + result);
            int product = multiply(3, 4);
            System.out.println("The product is: " + product);
        }
    }

