package java.question.Greedy.q0134;

/**
 * 
 * @author qinye 在一条环路上有 N 个加油站，其中第 i 个加油站有汽油 gas[i] 升。
 * 
 *         你有一辆油箱容量无限的的汽车，从第 i 个加油站开往第 i+1 个加油站需要消耗汽油 cost[i]
 *         升。你从其中的一个加油站出发，开始时油箱为空。
 * 
 *         如果你可以绕环路行驶一周，则返回出发时加油站的编号，否则返回 -1。
 */
public class Solution {
	public int canCompleteCircuit(int[] gas, int[] cost) {
		int curSum = 0;
		int min = Integer.MIN_VALUE;
		for (int i = 0; i < gas.length; i++) {
			int ret = gas[i] - cost[i];
			curSum += ret;
			if (curSum < min) {
				min = curSum;
			}
		}
		if (curSum < 0) {
			return -1;
		}
		if (min >= 0) {
			return 0;
		}
		for (int i = gas.length - 1; i >= 0; i--) {
			int ret = gas[i] - cost[i];
			min += ret;
			if (min >= 0) {
				return i;
			}
		}
		return -1;
	}

	public int canCompleteCircuit2(int[] gas, int[] cost) {
		int curSum = 0;
		int totalSum = 0;
		int start = 0;
		for (int i = 0; i < gas.length; i++) {
			int ret = gas[i] - cost[i];
			curSum += ret;
			totalSum += ret;
			if (curSum < 0) {
				start = i + 1;
				curSum = 0;
			}
		}
		if (totalSum < 0) {
			return -1;
		}
		return start;
	}
}
