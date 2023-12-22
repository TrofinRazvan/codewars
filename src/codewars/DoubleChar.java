package codewars;

public class DoubleChar {
    public static void main(String[] args) {
        String book = "abecedar";
        char[] array = book.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();

        for (char letter : array) {
            stringBuilder.append(letter);

//        char[] xyz = new char[x.length() * 4];
//        for (int index = 0, j = 0; j < x.length(); index += 4, j++) {
//            xyz[index] = x.charAt(j);
//            xyz[index + 1] = x.charAt(j);
        }
        System.out.println(stringBuilder);
    }
}