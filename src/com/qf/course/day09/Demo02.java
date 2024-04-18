package com.qf.course.day09;

import java.util.Scanner;

/**
 * @author youta
 * @version v1.0
 * @project QianFenCourse
 * @package com.qf.course.day09
 * @company 千锋教育
 * @date 2024/3/22 10:05
 */
public class Demo02 {
    public static void main(String[] args) {
        int[] nums = {2, 3, 5, 8, 11, 11, 12, 15, 16, 19, 45, 69};
        Scanner input = new Scanner(System.in);
        System.out.println("请输入要查找的数字:");
        if (input.hasNextInt()) {
            int number = input.nextInt();
            int index = binarySearch(nums, number);
            if (index != -1) {
                System.out.println("元素存在下标为:" + index);
            } else {
                System.out.println("元素不存在");
            }
        } else {
            System.out.println("输入的不是整数,请重新运行程序并输入整数!");
        }
    }

    private static int binarySearch(int[] arr, int key) {
        // 数组为空,返回负一表示元素不存在
        if (arr == null || arr.length == 0) {
            return -1;
        }
        int low = 0;
        int high = arr.length - 1;
        // 越界判断
        if(key < arr[low] || key > arr[high]){
            return -1;
        }
        while (low <= high) {
            int mid = (low + high) >>> 1;
            if (key < arr[mid]) {
                high = mid - 1;
            } else if (key > arr[mid]) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
