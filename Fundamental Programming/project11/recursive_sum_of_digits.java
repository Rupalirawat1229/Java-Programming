import java.util.Scanner;

public class recursive_sum_of_digits {
    public static int sumOFDigits(int n){
        if (n==0){
            return 0;
        }else {
            return (n%10) + sumOFDigits(n/10);
        }
    }
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER AN INTEGER:");
        int number = scanner.nextInt();
        int result = sumOFDigits(Math.abs(number));
        System.out.println("SUM OF DUGITS OF " + number + " is:" + result);

    }
}
