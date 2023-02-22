package boj.string._1259;

import java.util.Objects;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            String N = scanner.next();

            if (Objects.equals(N, "0")) {
                break;
            }

            boolean isYes = true;

            for (int i = 0; i < N.length() / 2; i++) {
                if (N.charAt(i) != N.charAt(N.length() - 1 - i)) {
                    isYes = false;
                    break;
                }
            }

            if (isYes) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
