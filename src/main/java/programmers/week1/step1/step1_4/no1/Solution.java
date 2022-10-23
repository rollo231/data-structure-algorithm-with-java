package programmers.week1.step1.step1_4.no1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public int solution(int[] A, int[] B) {
        int answer = 0;

        List<Integer> listA = Arrays.stream(A).sorted().boxed().collect(Collectors.toList());
        List<Integer> listB = Arrays.stream(B).sorted().boxed().collect(Collectors.toList());

        for (int i = 0; i < listB.size(); i++) {
            if (listB.get(i) > listA.get(i)) {
                answer = answer + 1;
            }
        }

        return answer;
    }
}
