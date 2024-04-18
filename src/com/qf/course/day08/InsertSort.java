package com.qf.course.day08;

/**
 * @author youta
 * @version v1.0
 * @project QianFenCourse
 * @package com.qf.course.day08
 * @company 千锋教育
 * @date 2024/3/21 16:32
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 20, 13, 25, 46};
        insertSort(arr);
        System.out.println("排序后数据为:");
        for (int i : arr) {
            System.out.print(i + "\t");
        }
    }

    private static void insertSort(int[] arr) {
        for(int i = 1; i<arr.length;i++){
            // 使用临时变量保存当前元素
            int temp = arr[i];
            int posIndex = i -1;
            while(posIndex >= 0 && arr[posIndex] > temp){
                // 向后移动元素
                arr[posIndex + 1] = arr[posIndex];
                posIndex--;
            }
            // 将保存的元素插入合适位置
            arr[posIndex + 1] = temp;
        }
    }
}
