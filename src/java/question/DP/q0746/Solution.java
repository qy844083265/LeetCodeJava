package java.question.DP.q0746;

/**
 * 数组的每个下标作为一个阶梯，第 i 个阶梯对应着一个非负数的体力花费值 cost[i]（下标从 0 开始）。
 * <p>
 * 每当你爬上一个阶梯你都要花费对应的体力值，一旦支付了相应的体力值，你就可以选择向上爬一个阶梯或者爬两个阶梯。
 * <p>
 * 请你找出达到楼层顶部的最低花费。在开始时，你可以选择从下标为 0 或 1 的元素作为初始阶梯。
 */
public class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[2];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for (int i = 2; i < cost.length; i++) {
            int min = Math.min(dp[0], dp[1]) + cost[i];
            dp[0] = dp[1];
            dp[1] = min;
        }
        return Math.min(dp[0], dp[1]);
    }
}
