package leetcode;

import java.util.*;

public class 二叉树的锯齿形层次遍历 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res =new ArrayList<>();
        LinkedList<Integer> list =new LinkedList<>();
        if(root == null) return res;
        Queue<TreeNode> q =new LinkedList<>();
        q.add(root);
        q.add(null);
        boolean flag = false;
        while(!q.isEmpty()){
            TreeNode node = q.poll();
            if(node!=null){
                if(flag){
                    list.addFirst(node.val);
                }else {
                    list.add(node.val);
                }
                if(node.left!=null) q.add(node.left);
                if(node.right!=null) q.add(node.right);
            }else{
                if(q.isEmpty()){
                    res.add(list);
                    break;
                }else{
                    q.add(null);
                    if(flag){
                        flag=false;
                    }else {
                        flag=true;
                    }
                    res.add(list);
                    list=new LinkedList<>();
                }
            }
        }
        return  res;
    }
    /*public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res =new ArrayList<>();
        List<Integer> list =new ArrayList<>();
        if(root == null) return res;
        Queue<TreeNode> q =new LinkedList<>();
        q.add(root);
        q.add(null);
        boolean flag = false;
        while(!q.isEmpty()){
            TreeNode node = q.poll();
            if(node!=null){
                list.add(node.val);
                if(node.left!=null) q.add(node.left);
                if(node.right!=null) q.add(node.right);
            }else{
                if(q.isEmpty()){
                    if(flag){
                        Collections.reverse(list);
                    }
                    res.add(list);
                    break;
                }else{
                    q.add(null);
                    if(flag){
                        Collections.reverse(list);
                        flag=false;
                    }else {
                        flag=true;
                    }
                    res.add(list);
                    list=new ArrayList<>();
                }
            }
        }
        return  res;
    }*/
}
