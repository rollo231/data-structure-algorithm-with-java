package programmers.string._72410;

// https://school.programmers.co.kr/learn/courses/30/lessons/72410
public class Solution {
    public String solution(String new_id) {
        StringBuilder answer = new StringBuilder();

        // 1. 소문자로 치환
        new_id = new_id.toLowerCase();

        // 2.
        for (int i = 0; i < new_id.length(); i++) {
            char ch = new_id.charAt(i);
            if (Character.isAlphabetic(ch) || Character.isDigit(ch) || ch == '_' || ch == '-' || ch == '.') {
                answer.append(ch);
            }
        }

        // 3.
        while (answer.toString().contains("..")) {
            answer = new StringBuilder(answer.toString().replace("..", "."));
        }

        // 4.
        if ((answer.length() > 0) && answer.charAt(0) == '.') {
            answer = new StringBuilder(answer.substring(1));
        }
        if ((answer.length() > 0) && answer.charAt(answer.length() - 1) == '.') {
            answer = new StringBuilder(answer.substring(0, answer.length() - 1));
        }

        // 5.
        if (answer.length() == 0) {
            answer = new StringBuilder("a");
        }

        // 6.
        if (answer.length() > 15) {
            answer = new StringBuilder(answer.substring(0, 15));
            if (answer.charAt(answer.length() - 1) == '.') {
                answer = new StringBuilder(answer.substring(0, answer.length() - 1));
            }
        }

        // 7.
        while (answer.length() < 3) {
            answer.append(answer.charAt(answer.length() - 1));
        }
        return answer.toString();
    }
}
