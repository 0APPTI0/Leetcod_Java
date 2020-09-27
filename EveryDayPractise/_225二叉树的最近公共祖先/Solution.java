package _225二叉树的最近公共祖先;

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class Solution {
    List<TreeNode> re = new ArrayList<>();
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        this.dfs(root,p,q);
        return re.get(re.size() - 1);
    }

    public void dfs(TreeNode node, TreeNode p, TreeNode q){
        if (node == null) return;
        if (judge(node,p) && judge(node,q)){
            re.add(node);
        }
        dfs(node.left, p,q);
        dfs(node.right,p,q);
    }

    public boolean judge(TreeNode node, TreeNode target){
        if (node == null) return false;
        if (node.val == target.val){
            return true;
        }
        if (target.val > node.val){
            return judge(node.right, target);
        }
        if (target.val < node.val){
            return judge(node.left, target);
        }
        return false;
    }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
