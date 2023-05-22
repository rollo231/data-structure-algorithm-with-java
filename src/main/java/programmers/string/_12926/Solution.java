package programmers.string._12926;

// https://school.programmers.co.kr/learn/courses/30/lessons/12926
public class Solution {
    public String solution(String s, int n) {
        // 1. 입력 문자열의 모든 문자에 대해 반복
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : s.toCharArray()) {
            stringBuilder.append(push(c, n));
        }
        return stringBuilder.toString();
    }

    private char push(char c, int n) {
        // 1.1 알파벳이 아닌 경우 문자를 그대로 이어 붙이기
        if (!Character.isAlphabetic(c)) {
            return c;
        }
        // 1.2 알파벳인 경우 n밀큼 밀어 이어붙이기
        int offset = Character.isUpperCase(c) ? 'A' : 'a';
        int position = c - offset;
        position = (position + n) % ('Z' - 'A' + 1);
        return (char) (offset + position);
    }
}
