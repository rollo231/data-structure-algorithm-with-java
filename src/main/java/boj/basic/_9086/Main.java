package boj.basic._9086;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int c = scanner.nextInt();

        for (int j = 0; j < c; j++) {
            String s = scanner.next();
            String first = String.valueOf(s.charAt(0));
            String last = String.valueOf(s.charAt(s.length() - 1));
            System.out.println(first + last);
        }

    }
}
