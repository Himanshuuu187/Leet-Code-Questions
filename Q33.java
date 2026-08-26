/*
    100. Same Tree

    Given the roots of two binary trees p and q,
    check whether they are the same.

    Two trees are the same if:
    1. They have the same structure.
    2. Corresponding nodes have the same value.
*/

class Q33 {

    public boolean compare(Node tree1, Node tree2) {

        // Both nodes are null
        if (tree1 == null && tree2 == null) {
            return true;
        }

        // One node is null and the other isn't
        if (tree1 == null || tree2 == null) {
            return false;
        }

        // Values are different
        if (tree1.value != tree2.value) {
            return false;
        }

        // Compare left and right subtrees
        return compare(tree1.left, tree2.left)
                && compare(tree1.right, tree2.right);
    }

    public class Node {
        private int value;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }
    }
}