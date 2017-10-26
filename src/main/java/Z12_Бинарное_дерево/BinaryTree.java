package Z12_Бинарное_дерево;

/*
* 12) Разработать функцию подсчета в заданном бинарном дереве числа узлов имеющих два наследника.[5]
*/

public class BinaryTree {

    public Node root;

    public void insert(Node node) {
        if (root == null)
            root = node;
        else {
            Node current = root;
            while (true) {
                if (current.compareTo(node) >= 0) {
                    if (current.left == null) {
                        current.left = node;
                        break;
                    } else
                        current = current.left;
                } else {
                    if (current.right == null) {
                        current.right = node;
                        break;
                    } else
                        current = current.right;
                }
            }
        }
    }

    public int countDoubleChNode() {
        if (root != null)
            return countDoubleChNodeFromCurrent(root);
        return 0;
    }

    public int countDoubleChNodeFromCurrent(Node start) {
        if (start.left != null && start.right != null)
            return 1 + countDoubleChNodeFromCurrent(start.left) + countDoubleChNodeFromCurrent(start.right);
        else if (start.left != null)
            return countDoubleChNodeFromCurrent(start.left);
        else if (start.right != null)
            return countDoubleChNodeFromCurrent(start.right);
        else return 0;
    }
}