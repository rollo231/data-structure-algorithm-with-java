package data_structure.heap;

import java.util.ArrayList;
import java.util.Collections;

public class Heap {

    public ArrayList<Integer> heapArray;

    public Heap(Integer data) {
        this.heapArray = new ArrayList<>();
        this.heapArray.add(null);
        this.heapArray.add(data);
    }

    public boolean insert(Integer data) {

        int insertedIdx, parentIdx;

        if (this.heapArray == null) {
            this.heapArray = new ArrayList<>();
            this.heapArray.add(null);
            this.heapArray.add(data);
            return true;
        }

        this.heapArray.add(data);
        insertedIdx = this.heapArray.size() - 1;

        while (this.moveUp(insertedIdx)) {
            parentIdx = insertedIdx / 2;
            Collections.swap(this.heapArray, insertedIdx, parentIdx);
            insertedIdx = parentIdx;
        }
        return true;
    }

    private boolean moveUp(Integer insertedIdx) {
        if (insertedIdx <= 1) {
            return false;
        }

        int parentIdx = insertedIdx / 2;

        return this.heapArray.get(insertedIdx) > this.heapArray.get(parentIdx);
    }

    public Integer pop() {
        int returnedData, poppedIdx, leftChildPoppedIdx, rightChildPoppedIdx;

        if (this.heapArray == null) {
            return null;
        }

        returnedData = this.heapArray.get(1);

        this.heapArray.set(1, this.heapArray.get(this.heapArray.size() - 1));
        this.heapArray.remove(this.heapArray.size() - 1);
        poppedIdx = 1;

        while (this.moveDown(poppedIdx)) {
            leftChildPoppedIdx = poppedIdx * 2;
            rightChildPoppedIdx = poppedIdx * 2 + 1;

            // CASE2: 오른쪽 자식 노드만 없을 때
            if (rightChildPoppedIdx >= this.heapArray.size()) {
                if (this.heapArray.get(poppedIdx) < this.heapArray.get(leftChildPoppedIdx)) {
                    Collections.swap(this.heapArray, poppedIdx, leftChildPoppedIdx);
                    poppedIdx = leftChildPoppedIdx;
                }
            }

            if (this.heapArray.get(leftChildPoppedIdx) > this.heapArray.get(rightChildPoppedIdx)) {
                if (this.heapArray.get(poppedIdx) < this.heapArray.get(leftChildPoppedIdx)) {
                    Collections.swap(this.heapArray, poppedIdx, leftChildPoppedIdx);
                    poppedIdx = leftChildPoppedIdx;
                }
            }

            if (this.heapArray.get(poppedIdx) < this.heapArray.get(rightChildPoppedIdx)) {
                Collections.swap(this.heapArray, poppedIdx, rightChildPoppedIdx);
                poppedIdx = rightChildPoppedIdx;
            }
        }
        return returnedData;
    }

    private boolean moveDown(Integer poppedIdx) {
        int leftChildPoppedIdx, rightChildPoppedIdx;

        leftChildPoppedIdx = poppedIdx * 2;
        rightChildPoppedIdx = poppedIdx * 2 + 1;

        if (leftChildPoppedIdx >= this.heapArray.size()) {
            return false;
        }

        if (rightChildPoppedIdx >= this.heapArray.size()) {
            return this.heapArray.get(poppedIdx) < this.heapArray.get(leftChildPoppedIdx);
        }

        if (this.heapArray.get(leftChildPoppedIdx) > this.heapArray.get(rightChildPoppedIdx)) {
            return this.heapArray.get(poppedIdx) < this.heapArray.get(leftChildPoppedIdx);
        }

        return this.heapArray.get(poppedIdx) < this.heapArray.get(rightChildPoppedIdx);

    }

}
