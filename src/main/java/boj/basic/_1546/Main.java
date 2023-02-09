package boj.basic._1546;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int max = 0;
        List<Integer> resultList = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int input = scanner.nextInt();
            if (max < input) {
                max = input;
            }
            resultList.add(input);
        }

        int finalMax = max;
        System.out.println(resultList
                .stream()
                .mapToDouble(a -> (double) a / finalMax)
                .sum() * 100 / N);
    }
}
