package data_structure.tree;

public class NodeMgmt {

    Node head = null;

    public boolean insertNode(int value) {
        // CASE1 : Node 가 하나도 없을 때
        if (this.head == null) {
            this.head = new Node(value);
            return true;
        }

        // CASE2 : Node 가 하나 이상 들어가 있을 때
        Node findNode = this.head;

        while (true) {
            // CASE2-1 : 현재 Node 의 왼쪽에 Node 가 들어가야할 때
            if (value < findNode.value) {
                if (findNode.left != null) {
                    findNode = findNode.left;
                } else {
                    findNode.left = new Node(value);
                    break;
                }
            }
            // CASE2-1 : 현재 Node 의 오른쪽에 Node 가 들어가야할 때
            if (value > findNode.value) {
                if (findNode.right != null) {
                    findNode = findNode.right;
                } else {
                    findNode.right = new Node(value);
                    break;
                }
            }
        }
        return true;
    }

    public Node searchNode(int value) {
        // CASE1 : Node 가 하나도 없을 때
        if (this.head == null) {
            return null;
        }
        // CASE2 : Node 가 하나 이상 있을 때
        Node findNode = this.head;
        while (findNode != null) {
            if (findNode.value == value) {
                return findNode;
            }
            if (value < findNode.value) {
                findNode = findNode.left;
            }
            findNode = findNode.right;
        }
        return null;
    }

    public boolean delete(int value) {

        boolean searched = false;

        Node currentParentNode = this.head;
        Node currentNode = this.head;

        // 코너 케이스1 : Node 가 하나도 없을 때
        if (this.head == null) {
            return false;
        }

        // 코너 케이스2 : Node 가 단지 하나만 있고, 해당 Node 가 삭제할 Node 일 때
        if (this.head.value == value && this.head.left == null && this.head.right == null) {
            this.head = null;
            return true;
        }

        while (currentNode != null) {
            if (currentNode.value == value) {
                searched = true;
                break;
            }
            if (value < currentNode.value) {
                currentParentNode = currentNode;
                currentNode = currentNode.left;
            } else {
                currentParentNode = currentNode;
                currentNode = currentNode.right;
            }
        }

        if (!searched) {
            return false;
        }

        // 여기까지 실행되면, currentNode 에는 해당 데이터를 가지고 있는 Node, currentParentNode 에는 해당 데이터를 가지고 있는 Node의 부모 Node

        // CASE1 : 삭제할 Node 가 Leaf Node 인 경우
        if (currentNode.left == null && currentNode.right == null) {
            if (value < currentParentNode.value) {
                // 작으면 부모 왼쪽 삭제
                currentParentNode.left = null;
            } else {
                // 크면 부모 오른쪽 삭제
                currentParentNode.right = null;
            }
            // 현재 노드 삭제
            currentNode = null;
            return true;
        }

        // CASE2-1 : 삭제할 Node 가 Child Node 를 가지고 있는 경우 (왼쪽)
        if (currentNode.left != null && currentNode.right == null) {
            if (value < currentParentNode.value) {
                currentParentNode.left = currentNode.left;
            } else {
                currentParentNode.right = currentNode.left;
            }
            currentNode = null;
            return true;
        }

        // CASE2-1 : 삭제할 Node 가 Child Node 를 가지고 있는 경우 (오른쪽)
        if (currentNode.left == null) {
            if (value < currentParentNode.value) {
                currentParentNode.left = currentNode.right;
            } else {
                currentParentNode.right = currentNode.right;
            }
            currentNode = null;
            return true;
        }

        // CASE3-1 : 삭제할 Node 가 Node 를 두 개 가지고 있고, (삭제할 Node 가 부모 Node 왼쪽에 있을 때)

        // 삭제할 Node 가 부모 Node 의 왼쪽에 있을 때
        if (value < currentParentNode.value) {

            Node changeNode = currentNode.right;
            Node changeParentNode = currentNode.right;

            while (changeNode.left != null) {
                changeParentNode = changeNode;
                changeNode = changeNode.left;
            }
            // 여기까지 실행되면, changeNode 에는 삭제할 Node 의 오른 쪽 Node 중에서,
            // 가장 작은 값을 가진 Node 가 들어있음

            if (changeNode.right != null) {
                // CASE3-1-1: changeNode 의 Child Node 가 있을 때
                changeParentNode.left = changeNode.right;
            } else {
                // CASE3-1-2: changeNode 의 Child Node 가 없을 때
                changeParentNode.left = null;
            }

            // currentParentNode 의 왼쪽 Child Node 에, 삭제할 Node의 오른쪽 자식 중,
            // 가장 작은 값을 가진 changeNode 를 연결
            currentParentNode.left = currentNode;

            // parentNode 의 왼쪽 Child Node 가 현재, changeNode 이고,
            // changeNode 의 왼쪽 / 오른쪽 Child Node 를 모두, 삭제할 currentNode 의
            // 기존 왼쪽 / 오른쪽 Node 로 변경
            changeNode.right = currentNode.right;
            changeNode.left = currentNode.left;

            currentNode = null;
            return true;
        }

        // CASE3-2 : 삭제할 Node 가 Node 를 두 개 가지고 있고, (삭제할 Node 가 부모 Node 오른쪽에 있을 때)
        if (value > currentParentNode.value) {
            Node changeNode = currentNode.right;
            Node changeParentNode = currentNode.right;
            while (changeNode.left != null) {
                changeParentNode = changeNode;
                changeNode = changeNode.left;
            }
            // 여기까지 실행되면, changeNode 에는 삭제할 Node 의 오른쪽 Node 중에서,
            // 가장 작은 값을 가진 Node 가 들어있음

            if (changeNode.right != null) {
                // Case 3-2-2: changeNode 의 오른쪽 Child Node 가 있을 때
                changeParentNode.left = changeNode.right;
            } else {
                // Case 3-2-1: changeNode 의 Child Node 가 없을 때
                changeParentNode.left = null;
            }

            // currParentNode 의 오른쪽 Child Node 에, 삭제할 Node 의 오른쪽 자식중,
            // 가장 작은 값을 가진 changeNode 를 연결
            currentParentNode.right = changeNode;

            // parentNode 의 왼쪽 Child Node 가 현재, changeNode 이고,
            // changeNode 의 왼쪽/오른쪽 Child Node 를 모두, 삭제할 currNode 의
            // 기존 왼쪽/오른쪽 Node 로 변경
            changeNode.right = currentNode.right;
            changeNode.left = currentNode.left;

            currentNode = null;
            return true;
        }
        return true;
    }
}
