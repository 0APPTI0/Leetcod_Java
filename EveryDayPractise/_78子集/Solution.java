package _78子集;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> tmp = new ArrayList<>();
    public List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        //List<Integer> list1 = Arrays.stream(nums).boxed().collect(Collectors.toList());
        getSubCollection(0, nums);
        // List<Integer> emp = new ArrayList<>();
        // result.add(emp);
        return result;
    }
    // 自顶向下解法，这样会出现重复子集；若加上排除重复子集的代码则会超时
    // public void getSubCollection(List<Integer> nums){
    //     if (nums.size() == 0){
    //         return;
    //     }
    //     result.add(nums);
    //     for (int i = 0; i < nums.size(); i ++){
    //         List<Integer> temp = new ArrayList<>();
    //         temp.addAll(nums);
    //         //Collections.copy(temp, nums);
    //         temp.remove(i);
    //         getSubCollection(temp);
    //     }
    // }

    //自底向上解法
    public void getSubCollection(int cur, int[] nums){
        if (cur == nums.length){
            result.add(new ArrayList<Integer>(tmp));
            return;
        }
        else{
            tmp.add(nums[cur]);
            getSubCollection(cur + 1, nums);
            tmp.remove(tmp.size() - 1);
            getSubCollection(cur + 1, nums);
        }

    }
}
