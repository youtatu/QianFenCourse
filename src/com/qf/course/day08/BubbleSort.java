package com.qf.course.day08;

/**
 * @author youta
 * @version v1.0
 * @project QianFenCourse
 * @package com.qf.course.day08
 * @company 千锋教育
 * @date 2024/3/21 14:26
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 2, 5, 26, 45};
        bubbleSort(arr);
        System.out.println("互换后的数组为:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    private static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            // 冒泡优化,如果没有交换直接退出
            boolean flag = false;
            System.out.println("____轮数_____" + i);
            for (int j = 0; j < arr.length - i - 1; j++) {
                System.out.println("次数:" + j);
                if (arr[j] > arr[j + 1]) {
                    flag = true;
                    // 互换arr[j]和arr[j+1]
                    arr[j] = arr[j] ^ arr[j + 1];
                    arr[j + 1] = arr[i] ^ arr[j + 1];
                    arr[j] = arr[i] ^ arr[j+1];
                }
            }
            if(!flag){
                break;
            }
        }
    }
}
