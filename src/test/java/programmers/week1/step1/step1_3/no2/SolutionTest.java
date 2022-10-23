package programmers.week1.step1.step1_3.no2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
        int[] durations = {5,3,7,6,4};

        long answer = new Solution().solution(43, durations);

        Assertions.assertEquals(answer, 150000);
    }
}
