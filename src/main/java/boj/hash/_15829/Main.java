package boj.hash._15829;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        String S = scanner.next();

        BigInteger result = BigInteger.ZERO;

        for (int i = 0; i < S.length(); i++) {
            result = result.add(
                    BigInteger.valueOf(S.charAt(i) - 'a' + 1).multiply(BigInteger.valueOf(31).pow(i))
            );
        }

        System.out.println(result.remainder(BigInteger.valueOf(1234567891)));
    }
}
