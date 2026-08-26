/*

                        701. Insert into a Binary Search Tree

                        Input: root = [4,2,7,1,3], val = 5
                        Output: [4,2,7,1,3,5]

*/










































class Q34 {

    public TreeNode insertIntoBST(TreeNode root, int val) {

        // If we reach an empty position,
        // insert the new node here.
        if (root == null) {
            return new TreeNode(val);
        }

        // Go to the left subtree
        if (val < root.val) {
            root.left = insertIntoBST(root.left, val);
        }

        // Go to the right subtree
        else if (val > root.val) {
            root.right = insertIntoBST(root.right, val);
        }

        return root;
    }
}