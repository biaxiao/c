package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class 二叉树的最大深度 {
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        Queue<TreeNode> q =new LinkedList<>();
        q.add(root);
        q.add(null);
        int maxLen=0;
        while(!q.isEmpty()){
            TreeNode node = q.poll();
            if(node!=null){
                if(node.left!=null) q.add(node.left);
                if(node.right!=null) q.add(node.right);
            }else{
                if(q.isEmpty()){
                    maxLen++;
                    break;
                }else{
                    maxLen++;
                    q.add(null);
                }
            }
        }
        return maxLen;
    }
    /*public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        if(root.left==null&& root.right==null) return 1;
        return 1+Math.max(maxDepth(root.left), maxDepth(root.right));
    }*/
}
