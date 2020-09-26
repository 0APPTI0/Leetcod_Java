package _113路经总和II;

import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<Integer> tmp = new ArrayList<Integer>();
        find(root, 0, sum, tmp);
        return result;
    }

    public void find(TreeNode node, int tempSum, int targetSum, List<Integer> tempList){
        if (node == null){
            return;
        }
        if (node.val + tempSum == targetSum && node.left == null && node.right == null){
            List<Integer> tempResultList = new ArrayList<>();
            tempResultList.addAll(tempList);
            tempResultList.add(node.val);
            result.add(tempResultList);
            return;
        }
        else {
            if (node.left == null && node.right == null){
                return;
            }
            tempList.add(node.val);
            if (node.left != null){
                find(node.left, node.val + tempSum, targetSum, tempList);
            }
            if (node.right != null){
                find(node.right, node.val + tempSum, targetSum, tempList);
            }
            tempList.remove(tempList.size() - 1);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root = new TreeNode(-2);
        root.right = new TreeNode(-3);
        solution.pathSum(root, -5);
    }
}
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){val = x;}
}
