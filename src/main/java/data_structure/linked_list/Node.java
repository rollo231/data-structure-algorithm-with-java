package data_structure.linked_list;

public class Node<T> {
    T data;
    Node<T> next = null;
    Node<T> prev = null;

    public Node(T data) {
        this.data = data;
    }
}
