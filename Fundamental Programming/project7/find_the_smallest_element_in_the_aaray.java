import java.util.Scanner;

public class find_the_smallest_element_in_the_aaray {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF THE AARAY:");
        int size = scanner.nextInt();
        int array[] = new int[size];
        int i;
        System.out.println("enter the element of the aaray:");
        for(i=0;i<size;i=i+1){
            array[i] = scanner.nextInt();
        }
        int smallest = array[0];
        for( i =1;i<size;i=i+1){
            if(array[i]>smallest){
                smallest=array[i];
            }
        }
        System.out.println("THE SMALLEST ELEMENT IN THE AARAY IS:"+smallest);
    }
}


