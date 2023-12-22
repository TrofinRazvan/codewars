package codewars;

public class CockroachSpeed {

    public static void main(String[] args) {
        System.out.println(cock(57));
    }

    public static int cock(double x) {
//        Integer value = Integer.valueOf((int)x);
//        return value * 1000 * 100 / 3600;
        double speedPerSecond = x * 1000.0 * 100.0 / 3600.0;
        return (int) Math.floor(speedPerSecond);
    }
}