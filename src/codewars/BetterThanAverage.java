package codewars;

public class BetterThanAverage {

    public static void main(String[] args) {

        int[] classPoints = {7, 8, 9, 10};
        int yourPoints = 8;
        System.out.println(AverageTest(classPoints, yourPoints));
    }

    public static boolean AverageTest(int[] classPoints, int yourPoints) {

        int sum = 0;
        for (int score : classPoints) {
            sum += score;
        }
        int classAverage = (sum + yourPoints) / (classPoints.length + 1);
        return yourPoints > classAverage;
    }
}
