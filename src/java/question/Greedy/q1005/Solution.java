package java.question.Greedy.q1005;

import java.util.Arrays;

/**
 * 给定一个整数数组 A，我们只能用以下方法修改该数组：我们选择某个索引 i 并将 A[i] 替换为 -A[i]，然后总共重复这个过程 K 次。（我们可以多次选择同一个索引 i。）
 * 以这种方式修改数组后，返回数组可能的最大和。
 */
public class Solution {
    public int largestSumAfterKNegations(Integer[] A, int K) {
        Arrays.sort(A, (a, b) -> Math.abs(a) - Math.abs(b));
        for (int i = 0; i < A.length; i++) {
            if (K > 0 && A[i] < 0) {
                A[i] = A[i] * (-1);
                K--;
            }
        }
        if (K > 0) {
            A[A.length - 1] *= -1;
            K--;
        }
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
        }
        return sum;
    }
}
