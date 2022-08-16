package data_structure.hash;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyHashTest {

    @Test
    void myHash() {
        MyHash hash = new MyHash(10);

        Slot slot = hash.saveData("이상원", "안녕?");

        assertEquals(hash.getData("이상원"), slot.value);
        System.out.println(slot.key);
        System.out.println(slot.value);
    }
}