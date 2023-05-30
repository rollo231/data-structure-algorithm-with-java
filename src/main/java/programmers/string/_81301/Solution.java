package programmers.string._81301;

// https://school.programmers.co.kr/learn/courses/30/lessons/81301
public class Solution {
    public int solution(String s) {
        String[] alphabets = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] digits = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        for (int i = 0; i < 10; i++) {
            s = s.replace(alphabets[i], digits[i]);
        }
        return Integer.parseInt(s);
    }
}
