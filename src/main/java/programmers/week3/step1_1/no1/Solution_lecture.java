package programmers.week3.step1_1.no1;

import java.util.Arrays;

public class Solution_lecture {
    public int solution(String[][] clothes) {
        return Arrays.stream(clothes)
                .map(c -> c[1])
                .distinct()
                .map(type -> (int) Arrays.stream(clothes).filter(c -> c[1].equals(type)).count())
                .map(c -> c + 1)
                .reduce(1, (c, n) -> c * n) - 1;
    }
}
