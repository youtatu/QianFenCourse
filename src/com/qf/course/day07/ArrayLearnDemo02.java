package com.qf.course.day07;

/**
 * @author youta
 * @version v1.0
 * @project QianFenCourse
 * @package com.qf.course.day07
 * @company 千锋教育
 * @date 2024/3/20 15:46
 */

public class ArrayLearnDemo02 {
    public static void main(String[] args) {
        statisticalElementAverage();
    }

    private static void statisticalElementAverage() {
        int[] arr = new int[]{90, 95, 32, 45};
        int sum = 0;

        for (int i : arr) {
            sum += i;
        }
        double average = (double)(sum / arr.length);
        System.out.printf("%.2f",average);
    }
}
