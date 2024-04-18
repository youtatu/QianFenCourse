package com.qf.course.day08;

/**
 * @author youta
 * @version v1.0
 * @project QianFenCourse
 * @package com.qf.course.day08
 * @company 千锋教育
 * @date 2024/3/21 11:35
 */
public class ArrayExpend {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2};
        // 将新数组的地址赋值给旧数组,完成数组扩容
        nums = arrayExpend(nums);
        for (int num : nums) {
            System.out.println(num);
        }
    }

    private static int[] arrayExpend(int[] nums) {
        int[] newNums = new int[nums.length * 2];
        System.arraycopy(nums, 0, newNums, 0, nums.length);
        // 返回新数组的地址
        return newNums;
    }
}
