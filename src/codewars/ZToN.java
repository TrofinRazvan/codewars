package codewars;

public class ZToN {

    public static void main(String[] args) {
        System.out.println(showSequence(0));
    }

    public static String showSequence(int value) {
//        int sum = 0;
//        StringBuilder sb = new StringBuilder();
//        if (value > 0) {
//            for (int i = 0; i < value; i++) {
//                sum += i;
//                sb.append(i);
//                if (i < value - 1) {
//                    sb.append(" + ");
//                }
//            }
//            sb.append(" = ").append(sum);
//        } else if (value < 0) {
//            sb.append(value).append(" < ").append("0");
//        } else if (value == 0) {
//            sb.append(value).append(" = ").append("0");
//        }
//        return sb.toString();
        if (value < 0)
            return value + "<0";

        if (value == 0)
            return "0=0";

        int sum = 0;
        String result = "0";

        for (int i = 1; i <= value; i++) {
            result += "+" + i;
            sum += i;
        }

        return result += " = " + sum;
    }
}