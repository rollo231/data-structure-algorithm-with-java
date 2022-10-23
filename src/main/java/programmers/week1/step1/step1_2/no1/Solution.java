package programmers.week1.step1.step1_2.no1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public String solution(int[] numbers) {

        List<String> answerList = Arrays.stream(numbers)
                .mapToObj(String::valueOf)
                .sorted((b, a) -> (a + b).compareTo(b + a))
                .collect(Collectors.toList());

        if (answerList.get(0).equals("0")) {
            return "0";
        }

        return String.join("", answerList);
    }
}
