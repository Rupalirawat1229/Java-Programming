public class find_first_divisible_number_break {
    public static void main(String[] args) {
            for (int i = 1; i <= 100; i = i + 1) {
                if (i % 3 == 0 && i % 7 == 0) {
                    System.out.println("The first number divisible by both 3 and 7 is: " + i);
                    break;
                }
            }
        }
    }


