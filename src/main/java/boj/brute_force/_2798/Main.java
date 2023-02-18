package boj.brute_force._2798;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        List<Integer> cards = new ArrayList<>();
        int result = 0;

        for (int i = 0; i < N; i++) {
            cards.add(scanner.nextInt());
        }

        result = getResult(M, cards, result);
        System.out.println(result);
    }

    private static int getResult(int M, List<Integer> cards, int result) {
        for (int i = 0; i < cards.size() - 2; i++) {
            for (int j = i + 1; j < cards.size() - 1; j++) {
                for (int k = j + 1; k < cards.size(); k++) {
                    int temp = cards.get(i) + cards.get(j) + cards.get(k);
                    if (temp == M) {
                        return temp;
                    }
                    if (temp > result && temp < M) {
                        result = temp;
                    }
                }
            }
        }
        return result;
    }
}
