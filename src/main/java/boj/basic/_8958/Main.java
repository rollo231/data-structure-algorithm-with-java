package boj.basic._8958;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        for (int i = 0; i < size; i++) {
            int result = 0;
            int count = 0;
            String input = scanner.next();
            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(j) == 'O') {
                    count++;
                } else {
                    count = 0;
                }
                result = result + count;
            }
            System.out.println(result);
        }
    }
}
