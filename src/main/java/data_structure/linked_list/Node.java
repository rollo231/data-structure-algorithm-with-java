package data_structure.linked_list;

public class Node<T> {
    Node<T> prev = null;
    T data;
    Node<T> next = null;

    public Node(T data) {
        this.data = data;
    }
}
