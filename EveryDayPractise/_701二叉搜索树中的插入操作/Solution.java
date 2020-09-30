package _701二叉搜索树中的插入操作;

public class Solution {
    boolean flag = false;
    TreeNode re;
    public TreeNode insertIntoBST(TreeNode root, int val) {
        loop(root,val);
        if (flag){
            return re;
        }
        else{
            return root;
        }
    }

    public void loop(TreeNode node, int val){
        if (node == null){
            flag = true;
            re = new TreeNode(val);
            return;
        }
        if (val < node.val){
            if (node.left != null){
                loop(node.left, val);
            }
            else{
                TreeNode child = new TreeNode(val);
                node.left = child;
                return;
            }
        }
        if (val > node.val){
            if (node.right != null){
                loop(node.right, val);
            }
            else{
                TreeNode child = new TreeNode(val);
                node.right = child;
                return;
            }
        }
    }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
