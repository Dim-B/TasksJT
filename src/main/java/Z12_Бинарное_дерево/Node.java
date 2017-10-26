package Z12_Бинарное_дерево;

public class Node implements Comparable<Node> {
    Node parent;
    Node left;
    Node right;
    Integer data;

    public Node(Integer data) {
        this.data = data;
    }

    @Override
    public int compareTo(Node o) {
        return data.compareTo(o.data);
    }
}
