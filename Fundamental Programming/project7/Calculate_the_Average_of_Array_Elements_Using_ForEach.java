import java.util.Scanner;
public class Calculate_the_Average_of_Array_Elements_Using_ForEach {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();
            int[] array = new int[size];
            int i;

            System.out.println("Enter the elements of the array:");
            for ( i = 0; i < size; i=i+1) {
                array[i] = scanner.nextInt();
            }
            int sum = 0;
            for (int element : array) {
                sum += element;
            }
            double average = (double) sum / size;
            System.out.println("The average of the array elements is: " + average);
        }
    }


