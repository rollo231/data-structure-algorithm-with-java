package programmers.week1.step1.step1_3.no1;

import java.util.stream.IntStream;

public class Solution_lecture {
    public int solution(int[] bugets, int M) {
        int min = 0;
        int max = IntStream.of(bugets)
                .max()
                .orElse(0);

        int answer = 0;
        while (min <= max) {
            final int mid = (min + max) / 2;

            int sum = IntStream.of(bugets)
                    .map(b -> Math.min(b, mid))
                    .sum();

            for (int b : bugets) {
                if (b > mid) {
                    sum += mid;
                } else {
                    sum += b;
                }
            }

            if (sum <= M) {
                min = mid + 1;
                answer = mid;
            } else {
                max = mid - 1;
            }
        }

        return answer;
    }
}
