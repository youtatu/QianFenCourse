package com.qf.course.day06;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author youta
 * @version v1.0
 * @project QianFenCourse
 * @package com.qf.course.day06
 * @company 千锋教育
 * @date 2024/4/16 14:28
 */
public class Demo03 {
    public static void main(String[] args) {
        String [] arr = {"a", "aa", "aaaa", "aaa"};
        Arrays.sort(arr,(o1, o2) -> o1.length()-o2.length());
        System.out.println(Arrays.toString(arr));
    }
}
