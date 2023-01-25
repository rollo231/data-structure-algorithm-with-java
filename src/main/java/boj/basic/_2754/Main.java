package boj.basic._2754;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        double point = switch (str) {
            case "A+" -> 4.3;
            case "A0" -> 4.0;
            case "A-" -> 3.7;
            case "B+" -> 3.3;
            case "B0" -> 3.0;
            case "B-" -> 2.7;
            case "C+" -> 2.3;
            case "C0" -> 2.0;
            case "C-" -> 1.7;
            case "D+" -> 1.3;
            case "D0" -> 1.0;
            case "D-" -> 0.7;
            default -> 0.0;
        };

        System.out.println(point);
    }
}
