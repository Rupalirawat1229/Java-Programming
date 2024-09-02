public class skip_divisible_5_numbers {

        public static void main(String[] args) {

            for (int i = 1; i <= 50; i=i+1) {

                if (i % 5 == 0) {
                    continue;
                }
                System.out.println(i);
            }
        }
    }

