package codewars;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of Fibonacci numbers to generate: ");
        int n = scanner.nextInt();

        int first = 1, second = 1;

        System.out.println("Fibonacci sequence with " + n + " numbers: ");

        System.out.println("first = " + first);
        for (int i = 0; i < n; i++) {
            System.out.println(second + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}