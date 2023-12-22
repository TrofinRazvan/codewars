package codewars;

import java.text.DecimalFormat;

public class SeriesSum {

    public static void main(String[] args) {
        System.out.println(seriesSum(1));
        System.out.println(seriesSum(2));
        System.out.println(seriesSum(5));
    }

    public static String seriesSum(int n) {
        if (n == 0) {
            return "0.00";
        }
        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum += 1.0 / (1 + 3 * i);
        }
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        return decimalFormat.format(sum);
    }

}
