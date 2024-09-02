import java.util.Scanner;
public class find_thr_largest_element_in_the_array {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();
        int array[] = new int[size];
        int i;
        System.out.println("enter the element of the aaray:");
        for(i=0;i<size;i=i+1){
            array[i] = scanner.nextInt();
        }
        int largest = array[0];
        for( i =1;i<size;i=i+1){
            if(array[i]>largest){
                largest=array[i];
            }
        }
        System.out.println("THE LARGEST ELEMENT IN THE AARAY IS:"+largest);
    }
}
