package boj.basic._2675;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        List<String> resultList = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            int inputSize = scanner.nextInt();
            String input = scanner.next();
            StringBuilder stringBuilder = new StringBuilder();
            for (int j = 0; j < input.length(); j++) {
                stringBuilder.append(String.valueOf(input.charAt(j))
                        .repeat(Math.max(0, inputSize)));
            }
            resultList.add(stringBuilder.toString());
        }

        for (String result : resultList) {
            System.out.println(result);
        }
    }
}
