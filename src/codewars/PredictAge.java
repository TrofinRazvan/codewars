package codewars;

public class PredictAge {

    public static void main(String[] args) {
        System.out.println(predictAge(23,24,12,23,23,67,78,67));
    }

    public static int predictAge(int age1, int age2, int age3, int age4, int age5, int age6, int age7, int age8) {
    int ages = age1 * age1 + age2 * age2 + age3 * age3 + age4 * age4 + age5 * age5 + age6 * age6 + age7 * age7 + age8 * age8;
    int sqrtAges = (int) Math.sqrt(ages);
    int divide = sqrtAges / 2;
    return (int) Math.floor(divide);
    }
}