package coding_test.uplus.no3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {

    public int[] solution(int[] people) {
        List<Integer> answerList = new ArrayList<>();

        // people 맵으로 카운트
        HashMap<Integer, Integer> countCoupon = new HashMap<>();

        for (int person : people) {
            if (countCoupon.get(person) == null) {
                countCoupon.put(person, 1);
            } else {
                int count = countCoupon.get(person) + 1;
                if (count == 4) {
                    answerList.add(person);
                    countCoupon.remove(person);
                } else {
                    countCoupon.put(person, count);
                }
            }
        }

        int[] answer = answerList.stream().mapToInt(i -> i).toArray();
        if (answer.length == 0) {
            return new int[]{-1};
        }
        return answer;
    }
}
