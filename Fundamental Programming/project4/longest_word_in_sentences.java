public class longest_word_in_sentences {
    public static void main(String[] args) {

        System.out.print("Enter a sentence: ");
        String sentence = (" FIND THE LONGEST WORD IN A SENTENCES");


        String[] words = sentence.split("\\s+");


        String longestWord = "";
        int maxLength = 0;


        for (String word : words) {
            if (word.length() > maxLength) {
                maxLength = word.length();
                longestWord = word;
            }
        }
        System.out.println("The longest word is: " + longestWord);


    }
}


