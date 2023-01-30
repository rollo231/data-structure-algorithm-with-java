package boj.basic._1152;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        String input = scanner.nextLine();

        StringTokenizer st = new StringTokenizer(input," ");

        System.out.println(st.countTokens());
    }
}
