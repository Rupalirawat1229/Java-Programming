public class palindrone_string {
        public static void main(String[]args){
            System.out.print("Enter a string: ");
            String original = "racecar";
            String reversed = new StringBuilder(original).reverse().toString();
            if (original.equals(reversed)) {
                System.out.println(original + " is a palindrome.");
            } else {
                System.out.println(original + " is not a palindrome.");
            }


        }
    }


