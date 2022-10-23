package programmers.week1.step1.step1_2.no1;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution_lecture {
    public String solution(int[] numbers) {
        String answer = IntStream.of(numbers)
                .mapToObj(String::valueOf)
                .sorted((s1, s2) -> (s2 + s1).compareTo(s1 + s2))
                .collect(Collectors.joining());

        if (answer.startsWith("0")) return "0";
        return answer;
    }
}
