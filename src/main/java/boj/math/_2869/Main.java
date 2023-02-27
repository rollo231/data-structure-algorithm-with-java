package boj.math._2869;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        int result = (C - B) / (A - B);

        if ((C - B) % (A - B) != 0) {
            result++;
        }
        System.out.println(result);
    }
}
