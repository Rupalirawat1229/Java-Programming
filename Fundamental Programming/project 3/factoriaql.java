public class factoriaql {
        public static void main(String[]args){
            int a=0;
            int b=1;
            int count=0;
            System.out.print("1st 10 fibonacci num: ");

            while(count<10){
                System.out.print(a+"");

                int next=a+b;
                a=b;
                b=next;
                count++;
            }
        }
    }

