package leetcode;

public class 翻转二叉树 {
    public TreeNode invertTree(TreeNode root) {
        if (root ==null) return root;
        TreeNode tmp =root.right;
        root.right=root.left;
        root.left=tmp;
        if(root.right!=null) invertTree(root.right);
        if(root.left!=null) invertTree(root.left);
        return root;
    }
}
