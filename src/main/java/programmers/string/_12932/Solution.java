package programmers.string._12932;

// https://school.programmers.co.kr/learn/courses/30/lessons/12932
public class Solution {
    public int[] solution(long n) {
        return new StringBuilder()
                .append(n)
                .reverse()
                .chars()
                .map(Character::getNumericValue)
                .toArray();
    }
}
