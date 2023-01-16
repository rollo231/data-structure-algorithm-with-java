package boj.basic._10807;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(scanner.nextInt());
        }

        int v = scanner.nextInt();

        int count = 0;

        for (Integer integer : list) {
            if (integer == v) {
                count++;
            }
        }
        System.out.println(count);
    }
}
