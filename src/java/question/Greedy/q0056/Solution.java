package java.question.Greedy.q0056;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * 给出一个区间的集合，请合并所有重叠的区间。
 */
public class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0) {
            return new int[0][2];
        }
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));
        List<int[]> mergeList = new ArrayList<>();
        for (int[] interval : intervals) {
            int left = interval[0];
            int right = interval[1];
            if (mergeList.size() == 0 || mergeList.get(mergeList.size() - 1)[1] < left) {
                mergeList.add(new int[]{left, right});
            } else {
                mergeList.get(mergeList.size() - 1)[1] = Math.max(mergeList.get(mergeList.size() - 1)[1], right);
            }
        }
        return mergeList.toArray(new int[mergeList.size()][]);
    }
}
