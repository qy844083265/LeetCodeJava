package java.question.Array.q0001;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
            if (map.containsKey(target - nums[i]) && map.get(target - nums[i]) != i) {
                return new int[]{map.get(target - nums[i]), i};
            }
        }
        return new int[]{-1, -1};
    }
}
