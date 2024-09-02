public class print_all_characters_expect_vowel {

        public static void main(String[] args) {
            System.out.print("Enter a string: ");
            String inputString = "rupali";


            String lowerCaseString = inputString.toLowerCase();


            for (int i = 0; i < lowerCaseString.length(); i=i+1) {
                char currentChar = lowerCaseString.charAt(i);


                if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' ||
                        currentChar == 'o' || currentChar == 'u') {
                    continue;
                }

                System.out.print(inputString.charAt(i));
            }
            System.out.println();
        }
    }

