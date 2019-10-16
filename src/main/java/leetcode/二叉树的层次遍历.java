package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class 二叉树的层次遍历 {

    public static void main(String[] args) {
        TreeNode root =new TreeNode(3);
        root.left=new TreeNode(9);
        root.right=new TreeNode(20);
        root.right.left=new TreeNode(15);
        root.right.right=new TreeNode(7);

        List<List<Integer>> lists = levelOrder(root);
        System.out.println(lists);
        List<Integer> list = printBFS(root);
        System.out.println(list);

    }

    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> res= new ArrayList<>();
        if (root ==null) return res;
        Queue<TreeNode> q =new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            TreeNode node = q.poll();
            if(node!=null){
                list.add(node.val);
                if(node.left!=null) q.add(node.left);
                if(node.right!=null) q.add(node.right);
            }else {
                if (q.isEmpty()){
                    res.add(list);
                    break;
                }else{
                    res.add(list);
                    list=new ArrayList<>();
                    q.add(null);
                }

            }
        }
        return res;
    }

    //层序打印
    public static List<Integer> printBFS(TreeNode root){
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList();
        if(root==null) return list;
        q.add(root);
        while(!q.isEmpty()){
            TreeNode node = q.poll();
            list.add(node.val);
            if(node.left!=null) q.add(node.left);
            if(node.right!=null) q.add(node.right);
        }
        return list;
    }
}
