package data_structure.linked_list;

public class SingleLinkedList<T> {

    public Node<T> head = null;

    public void addNode(T data) {
        if (this.head == null) {
            // 초기 node 가 없는 경우
            this.head = new Node<>(data);
        } else {
            Node<T> node = this.head;

            // next 가 있다면
            while (node.next != null) {
                // 다음 노드로 넘어가기
                node = node.next;
            }
            // next 가 없는 곳에 할당해주기
            node.next = new Node<>(data);
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

    // 중간에 데이터 추가
    public void addNodeInside(T data, T isData) {
        Node<T> searchedNode = this.search(isData);

        // 위치가 없다면 맨 뒤에 넣는다.
        if (searchedNode == null) {
            this.addNode(data);
        } else {
            // 찾은 노드 next 에 새로운 노드 넣기
            Node<T> nextNode = searchedNode.next;
            searchedNode.next = new Node<>(data);

            // 새로 넣은 노드에 next 는 기존 노드의 next
            searchedNode.next.next = nextNode;
        }
    }

    private Node<T> search(T data) {
        // head 가 null 이라면 null 임
        if (this.head != null) {
            Node<T> node = this.head;
            while (node != null) {
                // 일치하면 리턴
                if (node.data == data) {
                    return node;
                } else {
                    // 일치하지 않으면 다음
                    node = node.next;
                }
            }
        }
        return null;
    }

    public boolean delNode(T isData) {
        if (this.head == null) {
            return false;
        } else {
            Node<T> node = this.head;
            if (node.data == isData) {
                this.head = this.head.next;
                return true;
            } else {
                while (node.next != null) {
                    if (node.next.data == isData) {
                        node.next = node.next.next;
                        return true;
                    }
                }
                return false;
            }
        }
    }
}
