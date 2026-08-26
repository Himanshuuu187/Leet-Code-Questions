/*

144. Binary Tree Preorder Traversal
Easy
Topics
premium lock icon
Companies
Given the root of a binary tree, return the preorder traversal of its nodes' values.

 */
class Q35{
    public class node{
        private int value;
        private node left;
        private node right;

        public node(int value){
            this.value = value;

        }


    }

    private node root;

    private void PreOrder(node Node){
        if(Node == null){
            return;
        }

        System.out.println(Node.value + "");
        PreOrder(Node.left);
        PreOrder(Node.right);
    }


    
}