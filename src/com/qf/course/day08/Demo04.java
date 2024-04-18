package com.qf.course.day08;


/**
 * @author youta
 * @version v1.0
 * @project QianFenCourse
 * @package com.qf.course.day08
 * @company 千锋教育
 * @date 2024/3/21 14:04
 */
public class Demo04 {
    public static void main(String[] args) {
        printArray(100, 200, 300);

    }

    private static void printArray(int... arr) {
        for (int j : arr) {
            System.out.println(j);
        }
    }

}
