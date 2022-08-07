package data_structure.queue;

import java.util.ArrayList;

public class MyQueue<T> {
    private ArrayList<T> queue = new ArrayList<T>();

    // 데이터를 넣는다.
    public void enqueue(T item) {
        queue.add(item);
    }

    // 데이터를 꺼낸다. 가장 먼저 넣은 데이터를 꺼낸다. -> idx 0
    public T dequeue() {
        if (queue.isEmpty()) {
            return null;
        }
        return queue.remove(0);
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

}

