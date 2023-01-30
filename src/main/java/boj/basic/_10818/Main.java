package boj.basic._10818;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int firstNum = scanner.nextInt();
        int min = firstNum;
        int max = firstNum;

        for (int i = 0; i < N - 1; i++) {
            int nextNum = scanner.nextInt();
            if (min > nextNum) {
                min = nextNum;
            }
            if (max < nextNum) {
                max = nextNum;
            }
        }

        System.out.println(min + " " + max);
    }
}
