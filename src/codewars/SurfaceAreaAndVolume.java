package codewars;

import java.sql.Time;

public class SurfaceAreaAndVolume {

    public static void main(String[] args) {
        int depth = 12;
        int width = 13;
        int height = 12;

        int[] result = getSize(width,height,depth);

        System.out.println("Total surface area: " + result[0]);
        System.out.println("Volume: " + result[1]);
    }

    public static int[] getSize(int width, int height, int depth) {
        int surfaceArea = 2 * (depth * width + depth * height + width * height);
        int volume = depth * width * height;

        return new int[] {surfaceArea, volume};
    }
}