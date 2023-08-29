package com.dsa.arrays;

public class RotateArrayByK
{
    //https://leetcode.com/problems/rotate-array/submissions/
    public static void rotate(int[] nums, int k) {
        int[] rotateArray = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int pos = (i + k) % nums.length;
            rotateArray[pos] = nums[i];
        }
        //System.out.println(Arrays.toString(rotateArray));
        //nums = rotateArray;
        //System.out.println(Arrays.toString(nums));

        for (int i = 0; i < nums.length; i++) {
            nums[i] = rotateArray[i];
        }
    }
}
