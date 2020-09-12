package _637;

import java.util.ArrayList;
import java.util.List;

public class _637 {
    public List<Double> sum = new ArrayList<>();
    public List<Integer> nums = new ArrayList<>();
    public List<Double> averageOfLevels(TreeNode root) {
        cal(root,1);
        for (int i = 0; i < sum.size(); i ++){
            sum.set(i, sum.get(i)/nums.get(i));
        }
        return sum;
    }
    public void cal(TreeNode node, int deepth){
        if (deepth > sum.size()){
            nums.add(1);
            sum.add((double)node.val);
        }
        else {
            sum.set(deepth - 1, sum.get(deepth - 1) + node.val);
            nums.set(deepth - 1, nums.get(deepth - 1) + 1);
        }
        if (node.left != null){
            cal(node.left, deepth + 1);
        }
        if (node.right != null){
            cal(node.right, deepth + 1);
        }
    }

}

 class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
 }
