package boj.basic._2920;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> inputList = new ArrayList<>();

        for (int i = 0; i < 8; i++) {
            inputList.add(scanner.nextInt());
        }

        String result = "";
        for (int i = 0; i < inputList.size() - 1; i++) {
            if (inputList.get(i) == inputList.get(i + 1) - 1) {
                result = "ascending";
            } else if (inputList.get(i) == inputList.get(i + 1) + 1) {
                result = "descending";
            } else {
                result = "mixed";
                break;
            }
        }

        System.out.println(result);
    }
}
