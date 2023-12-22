package codewars;

public class TwiceAsOld {

    public static void main(String[] args) {
        System.out.println(twiceAsOld(50, 26));
    }

    public static int twiceAsOld(int dadYears, int sonYears) {
        if (dadYears - sonYears > 0) {
            return dadYears / 2 - sonYears;
        } else {
            return (dadYears - sonYears) * -1;
        }
    }
}