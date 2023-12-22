package codewars;

public class SmallestString {

    public static void main(String[] args) {
        System.out.println(findShort("mama are c mere"));
    }

    public static int findShort(String s) {
        String[] words = s.split(" ");

        int shortestLenght = Integer.MAX_VALUE;

        for (String word : words) {
            int wordLength = word.length();
            if (wordLength < shortestLenght) {
                shortestLenght = wordLength;
            }
        }
        return shortestLenght;
    }
}