package boj.basic._2577;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[10];

        int N = scanner.nextInt() * scanner.nextInt() * scanner.nextInt();

        String n = String.valueOf(N);

        for (int i = 0; i < n.length(); i++) {
            arr[n.charAt(i) - '0']++;
        }

        for (int result : arr) {
            System.out.println(result);
        }
    }
}
