package codewars;

import java.util.Arrays;

public class AlphabeticalSorting {

    public static void main(String[] args) {
        String[] srt = {"ioana", "maria", "georgeta", "dumitra"};
        System.out.println(alphabeticSort(srt));
    }

    public static String alphabeticSort(String[] s) {
        Arrays.sort(s, (s1, s2) -> s1.compareTo(s2));
        return Arrays.toString(s);
    }
}