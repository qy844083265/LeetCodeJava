package java.question.Greedy.q0045;

/**
 * 给定一个非负整数数组，你最初位于数组的第一个位置。
 * <p>
 * 数组中的每个元素代表你在该位置可以跳跃的最大长度。
 * <p>
 * 你的目标是使用最少的跳跃次数到达数组的最后一个位置。
 */
public class Solution {
    public int jump(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        // 当前覆盖最远距离下标
        int cur = 0;
        // 记录走的最大步数
        int result = 0;
        // 下一步覆盖最远距离下标
        int next = 0;
        for (int i = 0; i < nums.length; i++) {
            // 更新下一步覆盖最远距离下标
            next = Math.max(nums[i] + i, next);
            // 遇到当前覆盖最远距离下标
            if (i == cur) {
                // 如果当前覆盖最远距离下标不是终点
                if (cur != nums.length - 1) {
                    // 需要走下一步
                    result++;
                    // 更新当前覆盖最远距离下标（相当于加油
                    cur = next;
                    // 下一步的覆盖范围已经可以达到终点，结束循环
                    if (next >= nums.length) {
                        break;
                    }
                } else {
                    // 当前覆盖最远距离下标是集合终点，不用做ans++操作了，直接结束
                    break;
                }
            }
        }
        return result;
    }
}
