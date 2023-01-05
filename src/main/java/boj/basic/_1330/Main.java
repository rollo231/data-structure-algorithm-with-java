package boj.basic._1330;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static int A, B;

    public static String compare() {
        A = scanner.nextInt();
        B = scanner.nextInt();

        if (A > B) {
            return ">";
        }
        if (A < B) {
            return "<";
        }
        return "==";
    }

    public static void main(String[] args) {
        System.out.println(compare());
    }
}
