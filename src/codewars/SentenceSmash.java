package codewars;
//www.codewars.com/kata/53dc23c68a0c93699800041d/train/java
public class SentenceSmash {

    public static void main(String[] args) {

        String[] words = {"I", "am", "the", "best", "programmer"};
        String sentence = smashWords(words);
        System.out.println(sentence);
    }

    public static String smashWords(String[] words) {
        StringBuilder sentenceBuilder = new StringBuilder();
        for (String word : words) {
            sentenceBuilder.append(word).append(" ");
        }
        sentenceBuilder.deleteCharAt(sentenceBuilder.length() - 1);
        return sentenceBuilder.toString();
    }
}
