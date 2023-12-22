package codewars;

public class CamelCaseBreaker {

    public static void main(String[] args) {
        System.out.println(camelCase("camelCase"));
    }

    public static String camelCase (String input) {
        StringBuilder result = new StringBuilder();

        for (char word : input.toCharArray()) {
            if (Character.isUpperCase(word)) {
                result.append(" ");
            }
            result.append(word);
        }
        return result.toString();
    }
}