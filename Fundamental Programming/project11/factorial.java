import java.util.Scanner;

public class factorial {
    public static int factorial(int n){
        if (n==0){
            return 1;
        }else {
            return n *

                    factorial(n-1);
        }
    }
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER A POSITIVE INTEGRS:");
        int number = scanner.nextInt();
        if (number<0){
            System.out.println("PLEASE ENTER A POSITIVE INTEGER.");
        }else {
            int result = factorial(number);
            System.out.println("FACTORIAL OF "+number+"IS;"+result);
        }
        scanner.close();
    }
}
