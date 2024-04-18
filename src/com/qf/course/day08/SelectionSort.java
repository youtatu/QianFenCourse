package com.qf.course.day08;

/**
 * @author youta
 * @version v1.0
 * @project QianFenCourse
 * @package com.qf.course.day08
 * @company 千锋教育
 * @date 2024/3/21 16:02
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 10, 20, 12, 6};
        selectionSort(arr);
        System.out.println("互换后元素为:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.println("----- 轮次 -----:" + i);
            // 定义最小元素下标
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++){
                System.out.println("比较次数:" + j);
                if(arr[minIndex] > arr[j]){
                    minIndex = j;
                }
                if(minIndex != i){
                    // 互换arr[min]和arr[i]
                    arr[minIndex] = arr[minIndex] ^ arr[i];
                    arr[i] = arr[minIndex] ^ arr[i];
                    arr[minIndex] = arr[minIndex] ^ arr[i];
                }
            }
        }
    }
}
