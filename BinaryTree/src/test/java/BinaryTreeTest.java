import org.junit.jupiter.api.Test;
import org.junit.platform.engine.support.hierarchical.Node;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTest {

    @Test
    void BinaryTree() {
        BinaryTree tree = new BinaryTree();
        assertEquals(tree.first, null);
        assertEquals(tree.size, 0);
    }

    @Test
    void BinaryTreeCopy() {
        BinaryTree A = new BinaryTree();
        A.add(5, "abc");
        A.add(10, "cb3");
        A.add(1, "efg");
        BinaryTree B = new BinaryTree(A);
        assertEquals(A.first, B.first);
        assertEquals(A.size, B.size);
    }

    @Test
    void clear() {
        BinaryTree tree = new BinaryTree();
        tree.add(10, 'a');
        tree.add(5, 'b');
        tree.add(12, 'a');
        tree.clear();
        assertTrue(tree.IsEmpty());
    }

    @Test
    void add() {
        BinaryTree tree = new BinaryTree();
        tree.add(10, 'a');
        tree.add(5, 'b');
        tree.add(12, 'a');
        assertFalse(tree.IsEmpty());
    }

    @Test
    void getSize() {
        BinaryTree tree = new BinaryTree();
        tree.add(10, 'a');
        tree.add(5, 'b');
        tree.add(12, 'a');
        assertEquals(tree.getSize(), 3);
    }

    @Test
    void searchByIndex() {
        BinaryTree tree = new BinaryTree();
        tree.add(10, 'a');
        tree.add(5, 'b');
        tree.add(12, 'a');
        assertEquals(tree.SearchByIndex(10), 'a');
    }

    @Test
    void IsEmpty() {
        BinaryTree tree = new BinaryTree();
        assertTrue(tree.IsEmpty());
    }

    @Test
    void FullNodeCount() {
        BinaryTree tree = new BinaryTree();
        tree.add(10, 10);
        tree.add(7, 7);
        tree.add(15, 15);
        tree.add(13, 13);
        tree.add(20, 20);
        tree.add(9, 9);
        tree.add(17, 17);
        tree.add(4, 4);
        tree.add(8, 8);
        tree.add(1, 1);
        tree.add(6, 6);
        tree.add(5, 5);
        assertEquals(4, tree.FullNodeCount(tree.first));
    }
}