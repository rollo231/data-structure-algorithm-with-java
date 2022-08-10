package data_structure.linked_list;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoubleLinkedListTest {

    @Test
    @DisplayName("doubleLinkedList")
    void doubleLinkedList() {
        DoubleLinkedList<Integer> node = new DoubleLinkedList<>();

        node.addNode(1);
        node.addNode(2);
        node.addNode(3);

        assertEquals(node.searchFromHead(1), 1);
        assertNull(node.searchFromHead(4));

        assertEquals(node.searchFromTail(2), 2);
        assertNull(node.searchFromTail(4));

        assertTrue(node.insertToFront(2, 0));
        assertEquals(node.searchFromHead(0), 0);

        node.printAll();
    }
}