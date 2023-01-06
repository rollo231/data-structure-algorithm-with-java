package boj.basic._10950;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        int A;
        int B;
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < T; i++) {
            A = scanner.nextInt();
            B = scanner.nextInt();
            result.add(A + B);
        }

        for (int i = 0; i < T; i++) {
            System.out.println(result.get(i));
        }
    }
}
