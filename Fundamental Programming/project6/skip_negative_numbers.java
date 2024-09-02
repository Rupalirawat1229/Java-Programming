import java.util.Scanner;
public class skip_negative_numbers {
  public static void main(String[]args){
            Scanner scanner = new Scanner(System.in);
            int sum = 0;
            while (true) {
                System.out.print("Enter a number (0 to exit): ");
                int num = scanner.nextInt();
                if (num == 0) {
                    System.out.println("Exiting...");
                    break;
                }
                if (num < 0) {
                    continue;
                }
                sum += num;
            }
            System.out.println("Sum of positive numbers: " + sum);
        }
    }

