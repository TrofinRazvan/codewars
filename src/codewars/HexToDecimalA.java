package codewars;

//www.codewars.com/kata/57a4d500e298a7952100035d/train/java
public class HexToDecimalA {

    public static void main(String[] args) {
        System.out.println(hex("1A3F"));
    }

    public static int hex(final String hexString) {
        return Integer.parseInt(hexString, 16);
    }
}
