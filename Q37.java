class Q37 {

    public class Node {
        private int value;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node root;

    public void Insert(int value) {
        root = Insert(value, root);
    }

    private Node Insert(int value, Node node) {

        if (node == null) {
            return new Node(value);
        }

        if (value < node.value) {
            node.left = Insert(value, node.left);
        }
        else if (value > node.value) {
            node.right = Insert(value, node.right);
        }

        return node;
    }

    private int count = 0;

    public int kthSmallest(int k) {
        count = 0;
        return Inorder(root, k);
    }

    private int Inorder(Node node, int k) {

        if (node == null) {
            return -1;
        }

        // Go left
        int leftResult = Inorder(node.left, k);

        // If answer was found in left subtree
        if (leftResult != -1) {
            return leftResult;
        }

        // Visit current node
        count++;

        if (count == k) {
            return node.value;
        }

        // Go right
        return Inorder(node.right, k);
    }

    public static void main(String[] args) {

        Q37 tree = new Q37();

        tree.Insert(3);
        tree.Insert(1);
        tree.Insert(4);
        tree.Insert(2);

        System.out.println(tree.kthSmallest(1));
    }
}