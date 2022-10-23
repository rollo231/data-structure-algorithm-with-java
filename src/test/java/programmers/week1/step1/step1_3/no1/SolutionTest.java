package programmers.week1.step1.step1_3.no1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {

        // given
        int[] d = {1, 3, 2, 5, 4};

        // when
        int answer = new Solution().solution(d, 9);

        // then
        Assertions.assertEquals(answer, 3);
    }
}
