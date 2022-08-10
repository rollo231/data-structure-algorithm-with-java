package data_structure.linked_list;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingleLinkedListTest {

    @Test
    @DisplayName("singleLinkedList")
    void singleLinkedList() {
        SingleLinkedList<Integer> node = new SingleLinkedList<>();

        node.addNode(1);
        assertEquals(node.head.data, 1);

        node.addNode(2);
        assertEquals(node.head.next.data, 2);

        node.addNodeInside(3, 1);
        assertEquals(node.head.next.next.data, 2);

        assertTrue(node.delNode(1));
        assertEquals(node.head.data, 3);

        node.printAll();
    }

}