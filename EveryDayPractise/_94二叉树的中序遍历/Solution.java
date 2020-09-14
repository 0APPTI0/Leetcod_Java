package _94二叉树的中序遍历;

import java.util.ArrayList;
import java.util.List;

public class  Solution {
    List<Integer> result = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root){
        mid(root);
        return result;
    }

    public void mid(TreeNode node){
        if (node != null){
            mid(node.left);
            result.add(node.val);
            mid(node.right);
        }

    }

}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){val = x;}
}
