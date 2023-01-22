package boj.basic._5597;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean[] student = new boolean[31];

        for (int i = 0; i < 28; i++) {
            int pass = scanner.nextInt();
            student[pass] = true;
        }

        for (int i = 1; i <= 30; i++) {
            if (!student[i]) {
                System.out.println(i);
            }
        }
    }
}
