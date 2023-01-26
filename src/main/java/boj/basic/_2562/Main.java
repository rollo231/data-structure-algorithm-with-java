package boj.basic._2562;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = scanner.nextInt();
        int maxIdx = 1;

        for (int i = 2; i < 10; i++) {
            int input = scanner.nextInt();
            if (max < input) {
                max = input;
                maxIdx = i;
            }
        }

        System.out.println(max);
        System.out.println(maxIdx);
    }
}
