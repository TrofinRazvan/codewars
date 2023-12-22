package codewars;

public class DisplayArray {

    public static void main(String[] args) {
        int[][] x = new int[3][3];

        x[0][0] = 0;
        x[1][1] = 0;
        x[2][2] = 0;

        x[0] = new int[] {1,2,3};
        x[1] = new int[] {3,2,1};
        x[2] = new int[] {9,9,9};

        for (int[] y : x) {
            for (int z : y) {
                System.out.println(z);
            }
            System.out.println();
        }
    }
}