package data_structure.linked_list;

public class DoubleLinkedList<T> {

    public Node<T> head = null;
    public Node<T> tail = null;

    public void addNode(T data) {
        if (this.head == null) {
            this.head = new Node<>(data);
            this.tail = this.head;
        } else {
            Node<T> node = this.head;
            while (node.next != null) {
                node = node.next;
            }
            // 다음 노드 생성
            node.next = new Node<>(data);
            node.next.prev = node;
            this.tail = node.next;
        }
    }

    public void printAll() {
        if (head != null) {
            Node<T> node = this.head;
            System.out.println(node.data);
            while (node.next != null) {
                node = node.next;
                System.out.println(node.data);
            }
        }
    }

    public T searchFromHead(T isData) {
        if (this.head != null) {
            Node<T> node = this.head;
            while (node != null) {
                if (node.data == isData) {
                    return node.data;
                } else {
                    node = node.next;
                }
            }
        }
        return null;
    }

    public T searchFromTail(T isData) {
        if (this.head != null) {
            Node<T> node = this.tail;
            while (node != null) {
                if (node.data == isData) {
                    return node.data;
                } else {
                    node = node.prev;
                }
            }
        }
        return null;
    }

    public boolean insertToFront(T existedData, T addData) {
        // 헤드가 없을 때
        if (this.head == null) {
            this.head = new Node<>(addData);
            this.tail = this.head;
            return true;
            // 헤드가 일치하고 데이터 넣을 때
        } else if (this.head.data == existedData) {
            Node<T> newHead = new Node<>(addData);
            newHead.next = this.head;
            this.head = newHead;
            this.head.next.prev = this.head;
            return true;
        } else {
            Node<T> node = this.head;
            while (node != null) {
                if (node.data == existedData) {
                    Node<T> newNode = new Node<>(addData);
                    Node<T> prevNode = node.prev;

                    // 앞 노드 다음
                    prevNode.next = newNode;
                    // 새 노드 이전
                    newNode.prev = prevNode;
                    // 새 노드 다음
                    newNode.next = node;
                    // 현재 노드 이전
                    node.prev = newNode;

                    return true;
                } else {
                    node = node.next;
                }
            }
            return false;
        }
    }

}
