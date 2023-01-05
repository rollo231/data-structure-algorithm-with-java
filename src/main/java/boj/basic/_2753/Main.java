package boj.basic._2753;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static int year;

    public static int findLeapYear() {
        year = scanner.nextInt();

        if (year % 400 == 0) {
            return 1;
        }
        if (year % 4 == 0 && year % 100 != 0) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(findLeapYear());
    }
}
