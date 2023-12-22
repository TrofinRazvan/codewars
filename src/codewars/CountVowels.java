package codewars;

public class CountVowels {

    public static void main(String[] args) {
        System.out.println(count("teeeext"));
    }

    public static int count(String text) {
        String vowels = "aeiou";
        int count = 0;
//        for (char c : text.toCharArray()) {
//            if (vowels.contains(String.valueOf(c))) {
//                count++;
//            }
//        }
        for (int i = 0; i < text.length(); i++) {
            if (vowels.contains(text)) {
                count++;
            }
        }
        return count;
    }
}