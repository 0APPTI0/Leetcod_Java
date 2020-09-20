package _404左叶子之和;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> set = new ArrayList<>();
    public int sumOfLeftLeaves(TreeNode root) {
        loop(root,1);
        int result = 0;
        if (root == null){
            return 0;
        }
        for (int i = 0; i < set.size(); i ++){
            result += set.get(i);
        }
        return result;
    }
    public void loop(TreeNode node, int flag){
        if (node == null){
            return;
        }
        if (flag == 0 && node.left == null && node.right == null){
            set.add(node.val);
            return;
        }
        if (node.left != null){
            loop(node.left, 0);
        }
        if (node.right != null){
            loop(node.right, 1);
        }
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}