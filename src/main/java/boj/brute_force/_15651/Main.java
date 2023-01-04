package boj.brute_force._15651;

import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static int N, M;
    static List<Integer> list;
    static StringBuilder result = new StringBuilder();

    public static void input() {
        N = scanner.nextInt();
        M = scanner.nextInt();
        list = Arrays.asList(new Integer[M]);
    }

    public static void dfs(int depth) {
        if (depth == M) {
            for (int i = 0; i < M; i++) {
                result.append(list.get(i)).append(" ");
            }
            result.append("\n");
            return;
        }

        for (int i = 1; i <= N; i++) {
            list.set(depth, i);
            dfs(depth + 1);
        }
    }

    public static void main(String[] args) {
        input();
        dfs(0);
        System.out.println(result.toString());
    }
}
