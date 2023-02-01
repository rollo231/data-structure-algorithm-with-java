package boj.basic._2439;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            String stringBuilder = " ".repeat(N - i - 1) + "*".repeat(i + 1);
            System.out.println(stringBuilder);
        }
    }
}
