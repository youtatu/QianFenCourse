package com.qf.course.day06;

import static com.sun.org.apache.bcel.internal.classfile.Utility.printArray;

/**
 * @author youta
 * @version v1.0
 * @project QianFenCourse
 * @package com.qf.course.day06
 * @company 千锋教育
 * @date 2024/4/18 10:31
 */
public class Demo07 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9};
        printArray(1,nums);
    }

    private static void printArray(int x, int... arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
