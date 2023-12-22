package codewars;

public class ConvertToBinary {

    public static void main(String[] args) {
        System.out.println(convert(43));
    }

    public static String convert(int n) {
        if (n == 0) {
            return "0";
        }
        String binarResult = ""; //sir vid or String binarResult = new String();

        while (n > 0 ){
            int rest = n % 2;
            binarResult = rest + binarResult;
            n = n / 2;
        }

        return binarResult;
    }
}