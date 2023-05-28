package programmers.string._68935;

// https://school.programmers.co.kr/learn/courses/30/lessons/68935
public class Solution {
    public int solution(int n) {
        return Integer.valueOf(new StringBuilder(Integer.toString(n, 3)).reverse().toString(), 3);
    }
}
