import java.util.Scanner;
public class function_overloading {
        // Method to calculate the area of a circle
        public static double calculateArea(double radius) {
            return Math.PI * radius * radius;
        }

        // Method to calculate the area of a rectangle
        public static double calculateArea(double length, double width) {
            return length * width;
        }

        // Method to calculate the area of a triangle
        public  (double base, double height) {
            return 0.5 * base * height;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Choose the shape to calculate the area:");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Triangle");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Calculate the area of a circle
                    System.out.print("Enter the radius of the circle: ");
                    double radius = scanner.nextDouble();
                    System.out.printf("The area of the circle is: %.2f\n", calculateArea(radius));
                    break;

                case 2:
                    // Calculate the area of a rectangle
                    System.out.print("Enter the length of the rectangle: ");
                    double length = scanner.nextDouble();
                    System.out.print("Enter the width of the rectangle: ");
                    double width = scanner.nextDouble();
                    System.out.printf("The area of the rectangle is: %.2f\n", calculateArea(length, width));
                    break;

                case 3:
                    // Calculate the area of a triangle
                    System.out.print("Enter the base of the triangle: ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter the height of the triangle: ");
                    double height = scanner.nextDouble();
                    System.out.printf("The area of the triangle is: %.2f\n", calculateArea(base, height));
                    break;

                default:
                    System.out.println("Invalid choice. Please choose 1, 2, or 3.");
            }

        }
    }

