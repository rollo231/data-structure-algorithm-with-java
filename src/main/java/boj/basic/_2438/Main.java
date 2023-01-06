package boj.basic._2438;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < N; i++) {
            result.append("*");
            System.out.println(result);
        }
    }
}
