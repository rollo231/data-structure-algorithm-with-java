package programmers.week1.step1.step1_3.no2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public long solution(int goal, int[] durations) {

        int answer = 0;

        List<Integer> durationList = Arrays.stream(durations)
                .sorted()
                .map(i -> Math.floorDiv(goal, i))
                .boxed()
                .collect(Collectors.toList());

        for (int i = 0; i < durationList.size() - 1; i++) {
            answer = answer + ((durationList.get(i) - durationList.get(durationList.size() - 1)) * 10000);
        }
        return answer;
    }
}
