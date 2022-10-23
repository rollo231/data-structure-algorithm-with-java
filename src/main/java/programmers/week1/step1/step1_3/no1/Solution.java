package programmers.week1.step1.step1_3.no1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public int solution(int[] d, int budget) {

        int answer = 0;
        int acc = 0;

        List<Integer> list = Arrays.stream(d)
                .sorted()
                .boxed()
                .collect(Collectors.toList());

        for (Integer integer : list) {
            acc = acc + integer;

            if (acc <= budget) {
                answer = answer + 1;
            }
        }

        return answer;
    }
}
