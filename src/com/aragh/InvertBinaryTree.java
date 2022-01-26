package com.aragh;


public class InvertBinaryTree {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        TreeNode left1 = new TreeNode(2);
        TreeNode right1 = new TreeNode(7);
        TreeNode left21 = new TreeNode(1);
        TreeNode right21 = new TreeNode(3);
        TreeNode left22 = new TreeNode(6);
        TreeNode right22 = new TreeNode(9);


        root.setLeft(left1);
        root.setRight(right1);
        left1.setLeft(left21);
        left1.setRight(right21);

        right1.setLeft(left22);
        right1.setRight(right22);

        invertTree(root);

    }

    private static TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return root;
        }
       TreeNode temp = root.left;
       root.left = root.right;
       root.right = temp;
       invertTree(root.left);
       invertTree(root.right);
       return root;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public TreeNode getLeft() {
            return left;
        }

        public void setLeft(TreeNode left) {
            this.left = left;
        }

        public TreeNode getRight() {
            return right;
        }

        public void setRight(TreeNode right) {
            this.right = right;
        }
    }
}
