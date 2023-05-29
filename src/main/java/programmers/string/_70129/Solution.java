package programmers.string._70129;

// https://school.programmers.co.kr/learn/courses/30/lessons/70129
public class Solution {
    public int[] solution(String s) {
        int loop = 0;
        int removed = 0;

        while (!s.equals("1")) {
            int zeros = deleteZero(s);
            loop += 1;
            removed += zeros;

            int ones = s.length() - zeros;
            s = Integer.toString(ones, 2);
        }
        return new int[]{loop, removed};
    }

    // 0 제거 후 카운트 추가
    private int deleteZero(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                count++;
            }
        }
        return count;
    }
}
