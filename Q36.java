/*

108. Convert Sorted Array to Binary Search Tree



Input: nums = [-10,-3,0,5,9]
Output: [0,-3,9,-10,null,5]
Explanation: [0,-10,5,null,-3,null,9] is also accepted:

*/

import java.util.Scanner;

class Q36 {
    public class Node {
        Node left;
        int value;
        Node Right;

        public Node(int value) {
            this.value = value;
        }

    }

    public Node root;

    public void insert(int value) {
        root = insert(value, root);

    }

    private void insert(int value, Node node) {
        if (node == null) {
            node = new Node(value);
            return node;
        }

        if (value < node.value) {
            node.value = insert(value, node.left);
        }
        if (value > node.value) {
            node.value = insert(value, node.right);
        }

        return node;

    }
}