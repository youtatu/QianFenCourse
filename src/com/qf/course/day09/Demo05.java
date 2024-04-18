package com.qf.course.day09;

/**
 * @author youta
 * @version v1.0
 * @project QianFenCourse
 * @package com.qf.course.day09
 * @company 千锋教育
 * @date 2024/3/22 15:05
 */
public class Demo05 {
    public static void main(String[] args) {
        // 实现杨辉三角
        int[][] nums = new int[5][];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = new int[i + 1];
            // 遍历二维数组
            for (int j = 0; j < nums[i].length; j++) {
                // 元素赋值
                if (j == 0 || i == j) {
                    nums[i][j] = 1;
                } else {
                    nums[i][j] = nums[i - 1][j - 1] + nums[i - 1][j];
                }
            }
        }

        // 打印输出

        for (int[] num : nums) {
            for (int i : num) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }
    }
}
