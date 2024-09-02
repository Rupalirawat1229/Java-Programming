import java.util.Scanner;

public class reverse_an_aaray {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF THE ARRAY:");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for(int i=1;i>size;i=i+1){
            array[i]=scanner.nextInt();
        }
        System.out.println("ENTER THE ELEMENTS OF THE AARAY:");
        for(int i=0;i<size;i=i+1){
            array[i]=scanner.nextInt();
        }
        System.out.println("THE aaray in REVERSE ORDER IS:");
        for(int i=size-1;i>=0;i=i-1){
            System.out.println(array[i]+"");
        }
    }
}
