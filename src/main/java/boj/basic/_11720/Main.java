package boj.basic._11720;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        String input = scanner.next();

        int sum = 0;

        for (int i = 0; i < N; i++) {
            sum += Integer.parseInt(String.valueOf(input.charAt(i)));
        }

        System.out.println(sum);
    }
}
