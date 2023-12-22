package codewars;

public class RemoveSpaces {

    public static void main(String[] args) {
        System.out.println(noSpace("cas vsdv sdvsdf"));
    }

    public static String noSpace(final String x) {
        StringBuilder sb = new StringBuilder();
        for (char in : x.toCharArray()) {
            if (!Character.isWhitespace(in)) {
                sb.append(in);
            }
        }
        return sb.toString();
//        return x.replaceAll(" ","");
    }
}