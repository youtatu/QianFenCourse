package com.qf.course.day09;

import java.util.Arrays;

/**
 * @author youta
 * @version v1.0
 * @project QianFenCourse
 * @package com.qf.course.day09
 * @company 千锋教育
 * @date 2024/3/22 10:50
 */
public class Demo03 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 15, 26, 24, 35};
        System.out.println(Arrays.toString(nums));

        // 排序
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        // 二分查找
        System.out.println(Arrays.binarySearch(nums, 15));

        // 复制
        int[] newNums = Arrays.copyOf(nums,nums.length*2);
        System.out.println(Arrays.toString(newNums));

        int[] newNums2 = Arrays.copyOf(nums,5);
        System.out.println(Arrays.toString(newNums2));

        int[] newNums3 = Arrays.copyOfRange(nums, 2, 4);
        System.out.println(Arrays.toString(newNums3));



    }
}
