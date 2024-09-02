public class cubes2 {

        public static void main(String[]args){
            int num=5;
            int i=5;
            int sum =0;

            while(i<=num){
                sum=sum+i*i*i;
                i=i+2;
            }
            System.out.print("Sum of cubes of even numbers: "+sum);
        }
    }

