package com.draper;

/**
 * 看了下大佬的答案，觉得自己 low 爆了
 *
 * @author draper_hxy
 */
public class E1 {

    public static void main(String[] args) {
        int[] intputArray = {3, 3};
        int target = 6;

        int[] answerArray = solution(intputArray, target);
        System.out.printf("[%d, %d]", answerArray[0], answerArray[1]);

    }

    public static int[] solution(int[] nums, int target) {
        int result1 = 0, result2 = 0;

        point:
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result1 = i;
                    result2 = j;
                    break point;
                }

            }
        }

        return new int[]{result1, result2};
    }


}
