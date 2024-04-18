package com.qf.course.day08;

/**
 * @author youta
 * @version v1.0
 * @project QianFenCourse
 * @package com.qf.course.day08
 * @company 千锋教育
 * @date 2024/3/21 8:23
 */
public class Demo01 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swap(a, b);
        System.out.println("a:" + a + " " + "b:" + b);

    }
    private static void swap(int x, int y) {
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
    }
}
