package com.qf.course.day09;

import java.util.Scanner;

/**
 * @author youta
 * @version v1.0
 * @project QianFenCourse
 * @package com.qf.course.day09
 * @company 千锋教育
 * @date 2024/3/22 9:12
 */
public class Demo01 {
    public static void main(String[] args) {
        int[] nums = {12, 2, 3, 12, 5};
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int index = -1;
        // 使用循环一直向后判断,并更新下标
        while((index = sequenceSearch(nums,number,index+1))>-1){
            System.out.println(index);
        }
    }

    private static int sequenceSearch(int[] arr, int key, int from) {
        for (int i = from; i < arr.length; i++) {
            if(key == arr[i]){
                return i;
            }
        }
        return -1;
    }
}
