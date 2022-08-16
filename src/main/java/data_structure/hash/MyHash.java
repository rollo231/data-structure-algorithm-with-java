package data_structure.hash;

import java.util.Objects;

public class MyHash {

    public Slot[] hashTable;

    public MyHash(Integer size) {
        this.hashTable = new Slot[size];
    }

    public int hashFunc(String key) {
        return (int) (key.charAt(0)) % this.hashTable.length;
    }

    public Slot saveData(String key, String value) {
        int address = this.hashFunc(key);
        Slot slot = this.hashTable[address];
        // 주소가 비었을 경우 생성해 준다.
        if (slot == null) {
            return this.hashTable[address] = new Slot(key, value);
        }

        // 주소를 증가 시키면서 키 값을 찾는다.
        int lastAddress = address;
        for (int currAddress = address; currAddress < this.hashTable.length; currAddress++) {

            // 키가 같을 경우 값을 저장한다.
            if (Objects.equals(slot.key, key)) {
                slot.value = value;
                return slot;
            }
            lastAddress = currAddress;
        }

        return this.hashTable[lastAddress] = new Slot(key, value);
    }

    public String getData(String key) {
        int address = this.hashFunc(key);
        Slot slot = this.hashTable[address];

        if (slot.key == null) {
            return null;
        }

        for (int currAddress = address; currAddress < this.hashTable.length; currAddress++) {

            // 키가 같을 경우 값을 저장한다.
            if (Objects.equals(slot.key, key)) {
                return slot.value;
            }

        }
        return null;
    }

}
