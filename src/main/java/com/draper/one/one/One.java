package com.draper.one.one;

/**
 * @see <a href="https://leetcode-cn.com/problems/two-sum/">https://leetcode-cn.com/problems/two-sum/</a>
 *
 */
public class One {

    public static void main(String[] args) {
        int[] solution = new Solution().twoSum(new int[]{2, 7, 11, 15}, 9 );
        System.out.println(solution[0] + "," + solution[1]);
    }

}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int i1 = 0; i1 < nums.length; i1++) {
                if (nums[i] + nums[i1] == target){
                    return new int[]{i, i1};
                }
            }
        }

        return null;
    }
}
