package Z12_Бинарное_дерево;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinaryTreeTest {

    BinaryTree binaryTree1 = new BinaryTree();
    /*
                10
                    15
                       17
                    16    17
                             20
    */
    @Before
    public void initTree1() {
        binaryTree1.insert(new Node(10));
        binaryTree1.insert(new Node(15));
        binaryTree1.insert(new Node(17));
        binaryTree1.insert(new Node(17));
        binaryTree1.insert(new Node(16));
        binaryTree1.insert(new Node(20));
    }

    BinaryTree binaryTree2 = new BinaryTree();
    /*
                    10
                 5      15
               3   7       17
                        16    17
                                 20
        */
    @Before
    public void initTree2() {
        binaryTree2.insert(new Node(10));
        binaryTree2.insert(new Node(5));
        binaryTree2.insert(new Node(15));
        binaryTree2.insert(new Node(3));
        binaryTree2.insert(new Node(7));
        binaryTree2.insert(new Node(17));
        binaryTree2.insert(new Node(17));
        binaryTree2.insert(new Node(16));
        binaryTree2.insert(new Node(20));
    }

    BinaryTree binaryTree3 = new BinaryTree();
    /*
                null
     */

    @Test
    public void countDoubleChNode() throws Exception {
        int result1 = 1;
        int testResult1 = binaryTree1.countDoubleChNode();
        assertEquals(result1, testResult1);
        int result2 = 3;
        int testResult2 = binaryTree2.countDoubleChNode();
        assertEquals(result2, testResult2);
        int result3 = 0;
        int testResult3 = binaryTree3.countDoubleChNode();
        assertEquals(result3, testResult3);
    }

}