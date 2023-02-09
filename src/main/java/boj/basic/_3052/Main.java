package boj.basic._3052;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashSet<Integer> resultSet = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            resultSet.add(scanner.nextInt() % 42);
        }

        System.out.println(resultSet.size());
    }
}
