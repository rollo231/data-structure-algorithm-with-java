package boj.basic._2420;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static long N, M;

    public static long abs() {
        N = scanner.nextLong();
        M = scanner.nextLong();

        return Math.abs(N - M);
    }

    public static void main(String[] args) {
        System.out.println(abs());
    }
}
