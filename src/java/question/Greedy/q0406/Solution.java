package java.question.Greedy.q0406;

import java.util.Arrays;

/**
 * 假设有打乱顺序的一群人站成一个队列，数组 people 表示队列中一些人的属性（不一定按顺序）。每个 people[i] = [hi, ki] 表示第 i 个人的身高为 hi ，前面 正好 有 ki 个身高大于或等于 hi 的人。
 * <p>
 * 请你重新构造并返回输入数组 people 所表示的队列。返回的队列应该格式化为数组 queue ，其中 queue[j] = [hj, kj] 是队列中第 j 个人的属性（queue[0] 是排在队列前面的人）。
 */
public class Solution {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (person1, person2) -> {
            if (person1[0] != person2[0]) {
                return person2[0] - person1[0];
            } else {
                return person1[1] - person2[1];
            }
        });
        int row_len = people.length;
        int col_len = people[0].length;
        int[][] result = new int[row_len][col_len];
        for (int i = 0; i < people.length; i++) {
            if (people[i][1] >= i) {
                result[i] = people[i];
            } else {
                for (int j = i - 1; j >= people[i][1]; j--) {
                    result[j + 1] = result[j];
                }
                result[people[i][1]] = people[i];
            }
        }
        return result;
    }
}
