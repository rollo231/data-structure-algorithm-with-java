package programmers.string._12930;

// https://school.programmers.co.kr/learn/courses/30/lessons/12930
public class Solution {
    public String solution(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        boolean toUpper = true;
        for (char c : s.toCharArray()) {
            if (!Character.isAlphabetic(c)) {
                stringBuilder.append(c);
                toUpper = true;
            } else {
                if (toUpper) {
                    stringBuilder.append(Character.toUpperCase(c));
                } else {
                    stringBuilder.append(Character.toLowerCase(c));
                }
                toUpper = !toUpper;
            }
        }
        return stringBuilder.toString();
    }
}
