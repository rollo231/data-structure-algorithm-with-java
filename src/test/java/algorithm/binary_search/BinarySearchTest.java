package algorithm.binary_search;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class BinarySearchTest {

    @Test
    void search() {

        // given
        List<Integer> myList = List.of(1, 3, 5, 7, 9);

        // when
        BinarySearch binarySearch = new BinarySearch(myList);

        // then
        assertEquals(binarySearch.search(3), 1);
        assertNull(binarySearch.search(-1));
    }
}