package _18四数之和;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    List<List<Integer>> result;
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        result = new ArrayList<>();
        List list = new ArrayList<>();
        dfs(nums,target,0,list);
        return result;
    }
    public void dfs(int[] nums, int target,int idx,List list){
        if(list.size() == 4 && target == 0){
            result.add(new ArrayList<>(list));
            return;
        }
        if(list.size() == 4 || idx >= nums.length){
            return;
        }
        if(nums[idx] > 0 && target < nums[idx]){
            return;
        }
        list.add(nums[idx]);
        dfs(nums,target - nums[idx],idx + 1,list);
        list.remove(list.size() - 1);
        int next = idx+1;
        while(next < nums.length && nums[next] == nums[idx]){
            next++;
        }
        dfs(nums,target,next,list);
    }
}
/**
 * class Solution {
 *     List<List<Integer>> result = new ArrayList<>();
 *     public List<List<Integer>> fourSum(int[] nums, int target) {
 *         int[] state = new int[nums.length];
 *         List<Integer> set = new ArrayList<>();
 *         loop(nums,state,0,target,0,set);
 *         return result;
 *     }
 *
 *     public void loop(int[] nums, int[] state, int sum, int target, int times, List<Integer> tempResult){
 *         if (times == 4 ){
 *             if (sum == target){
 *                 result.add(tempResult);
 *             }
 *             return;
 *         }
 *         for (int i = 0; i < nums.length; i++){
 *             if (state[i] == 1) continue;
 *             state[i] = 1;
 *             sum += nums[i];
 *             List<Integer> temp = new ArrayList<>();
 *             temp.addAll(tempResult);
 *             temp.add(nums[i]);
 *             loop(nums, state, sum, target, times+1, temp);
 *             state[i] = 0;
 *             sum -= nums[i];
 *         }
 *     }
 * }
 */