package coding_test.uplus.no1;

import java.util.Arrays;
import java.util.List;

public class Solution {

    public int solution(int[] openA, int[] closeB) {

        int answer = 0;

        List<Integer> openAList = Arrays.stream(openA).boxed().toList();
        List<Integer> closeBList = Arrays.stream(closeB).boxed().toList();

        int point = 0;
        int idx = 0;

        // 첫 루프
        for (int i = 0; i < openAList.size(); i++) {

            if (openAList.get(i) < closeBList.get(idx)) {
                answer ++;

            }

        }


        return answer;
    }

}
