package java.question.Array.q0015;

import java.util.*;

public class Solution {
    /**
     * 排序后中间夹
     *
     * @param nums
     * @return
     */
    public List<List<Integer>> threeSum(int[] nums) {
        //排好序
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            int target = (-1) * nums[i];
            while (j < k) {
                if (nums[j] + nums[k] == target) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    set.add(list);
                    j++;
                }
                if (nums[j] + nums[k] < target) {
                    j++;
                }
                if (nums[j] + nums[k] > target) {
                    k--;
                }
            }
        }
        return new ArrayList<>(set);
    }

    public List<List<Integer>> threeSum01(int[] nums) {
        List<List<Integer>> myList = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            int target = (-1) * nums[i];
            Set<Integer> set = new HashSet<>();
            for (int j = i + 1; j < nums.length - 1; j++) {
                if (!set.contains(target - nums[j])) {
                    set.add(nums[j]);
                } else {
                    List<Integer> result = Arrays.asList(nums[i], target - nums[j], nums[j]);
                    if (!myList.contains(result)) {
                        myList.add(result);
                    }
                }

            }
        }
        return myList;
    }
}
