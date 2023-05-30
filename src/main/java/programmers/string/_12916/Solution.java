package programmers.string._12916;

// https://school.programmers.co.kr/learn/courses/30/lessons/12916
public class Solution {
    boolean solution(String s) {
        String string = s.toLowerCase();
        int countP = string.length() - string.replace("p", "").length();
        int countY = string.length() - string.replace("y", "").length();
        return countP - countY == 0;
    }
}
