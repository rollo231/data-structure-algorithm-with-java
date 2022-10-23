package programmers.week1.step1.step1_1.no1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public int solution(int n, int[] stations, int w) {
        List<Integer> coveredList = new ArrayList<>();

        for (int station : stations) {
            coveredList.addAll(getCoveredList(n, station, w));
        }

        Set<Integer> coveredSet = new HashSet<>(coveredList);
        System.out.println(coveredSet);

        return getMin(n - coveredSet.size(), coveredSet.size(), 2 * w + 1);
    }

    private List<Integer> getCoveredList(int n, int station, int w) {
        List<Integer> coveredList = new ArrayList<>();
        coveredList.add(station);
        for (int i = 1; i <= w; i++) {
            if (station - i > 0) {
                coveredList.add(station - i);
            }
            if (station + 1 <= n) {
                coveredList.add(station + i);
            }
        }
        return coveredList;
    }

    private Integer getMin(int notCovered, int covered, int totalW) {
        return ((int) Math.ceil((double) notCovered / (double) totalW)) + isFullCovered(covered, totalW);
    }

    private int isFullCovered(int covered, int totalW) {
        if (covered % totalW == 0) {
            return 0;
        }
        return 1;
    }
}
