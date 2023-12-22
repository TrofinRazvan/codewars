package codewars;

import java.util.Scanner;

public class TemperatureConversion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int x = scanner.nextInt();

        double conv = (x * 9.0/5.0) + 32.0;

        System.out.println("Celsius " + x + " to Fahrenheit is " + conv);
    }
}