package boj.basic._10872;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        System.out.println(factorial(N));
    }

    public static int factorial(int N) {
        if (N == 0) {
            return 1;
        }
        return N * factorial(N - 1);
    }
}
