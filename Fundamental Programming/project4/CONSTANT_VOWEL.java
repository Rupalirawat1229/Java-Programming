public class CONSTANT_VOWEL {
    public  static  void main(String[]args){

                System.out.print("Enter a string: ");
                String input = "consonant";
                int vowelCount = 0;
                int consonantCount = 0;
                String lowerCaseInput = input.toLowerCase();
                for (int i = 0; i < lowerCaseInput.length(); i=i+1) {
                    char ch = lowerCaseInput.charAt(i);
                    if (Character.isLetter(ch)) {
                        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                            vowelCount++;
                        } else {
                            consonantCount++;
                        }
                    }
                }
                System.out.println("Number of vowels: " + vowelCount);
                System.out.println("Number of consonants: " + consonantCount);
            }
        }

