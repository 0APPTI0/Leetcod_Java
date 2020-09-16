package _226翻转二叉树;

public class Solution {
    public TreeNode invertTree(TreeNode root) {
        reverse(root);
        return root;
    }
    public void reverse(TreeNode node){
        if (node == null){
            return;
        }
        TreeNode temp = new TreeNode();
        temp = node.left;
        node.left = node.right;
        node.right = temp;
        reverse(node.left);
        reverse(node.right);
    }
}
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
    TreeNode(){}
}
