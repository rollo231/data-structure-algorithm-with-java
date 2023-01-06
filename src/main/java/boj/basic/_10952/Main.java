package boj.basic._10952;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A;
        int B;
        List<Integer> result = new ArrayList<>();

        do {
            A = scanner.nextInt();
            B = scanner.nextInt();
            result.add(A + B);
        } while (!(A == 0 & B == 0));

        for (int i = 0; i < result.size() - 1; i++) {
            System.out.println(result.get(i));
        }
    }
}
