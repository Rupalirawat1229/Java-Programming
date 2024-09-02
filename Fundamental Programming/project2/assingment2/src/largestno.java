public class largestno {
    public  static void main(String[]args){
        int num1= 12;
        int num2=25;
        int num3=52;
        int large;
        if (num1 >= num2) {
            if (num1 >= num3) {
                large = num1;
            } else {
                large = num3;
            }
        } else {
            if (num2 >= num3) {
                large = num2;
            } else {
                large = num3;
            }
        }


        System.out.println("The maximum of the three numbers is: " + large);

    }
}




