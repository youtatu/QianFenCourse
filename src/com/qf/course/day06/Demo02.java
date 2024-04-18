package com.qf.course.day06;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author youta
 * @version v1.0
 * @project QianFenCourse
 * @package com.qf.course.day06
 * @company 千锋教育
 * @date 2024/4/16 11:24
 */
public class Demo02 {
    public static void main(String[] args) {
        Integer[] arr = {2, 2, 3, 4, 6, 9};
        // 匿名函数
        /*
        Arrays.sort(
                arr,new Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return o1 - o2;
                    }
                }
        );
        */
        // lambda 匿名函数简写
        Arrays.sort(arr,(o1, o2) -> o1 - o2);

        System.out.println(Arrays.toString(arr));
    }
}
