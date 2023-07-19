package codewars;

public class HexToDecimalM {

    public static void main(String[] args) {
        String hexString = "1A3fF";
        int decimalValue = hex(hexString);
        System.out.println(hexString + decimalValue);
    }

    public static int hex(String hexString) {

        hexString = hexString.toUpperCase();
        int decimalValue = 0;
        int base = 1;

        for (int index = 0; index < hexString.length(); index++) {
            char hexChar = hexString.charAt(index);
            int digitValue;

            if (hexChar >= '0' && hexChar <= '9') {
                digitValue = hexChar - '0';
            } else if (hexChar >= 'A' && hexChar <= 'F') {
                digitValue = hexChar - 'A' + 10;
            } else {
                throw new IllegalArgumentException("Invalid hexadecimal string: " + hexString);
            }
            decimalValue += digitValue * base;
            base *= 16;
        }
        return decimalValue;
    }
}
