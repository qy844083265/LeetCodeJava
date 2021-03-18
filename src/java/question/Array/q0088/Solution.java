/*
 * @Author: your name
 * @Date: 2020-07-11 13:34:43
 * @LastEditTime: 2020-07-11 13:49:42
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \leetcodelearn\src\main\java\com\amd\leetcode\leetcodelearn\question\Array\q0088\Solution.java
 */
package java.question.Array.q0088;

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = n + m - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
        while (i < 0 && k >= 0) {
            nums1[k--] = nums2[j--];
        }
        while (j < 0 && k >= 0) {
            nums1[k--] = nums1[i--];
        }
    }
}