package programmers.week1.step1.step1_1.no1;

public class Solution_lecture {
    public int solution(int n, int[] stations, int w) {
        int answer = 0;
        int si = 0;
        int position = 1;

        while (position <= n) {
            if (si < stations.length && stations[si] - w <= position) {
                position = stations[si] + w + 1;
                si += 1;
            } else {
                // 기지국 세운다.
                answer += 1;

                // 전파 범위
                position += w * 2 + 1;
            }
        }
        return answer;
    }
}
