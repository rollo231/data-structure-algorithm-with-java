package boj.basic._14681;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static int x, y;

    public static int findQuadrant() {
        x = scanner.nextInt();
        y = scanner.nextInt();

        if (x > 0 && y > 0) {
            return 1;
        }
        if (x < 0 && y < 0) {
            return 3;
        }
        if (x > 0 && y < 0) {
            return 4;
        }
        return 2;
    }


    public static void main(String[] args) {
        System.out.println(findQuadrant());
    }
}
