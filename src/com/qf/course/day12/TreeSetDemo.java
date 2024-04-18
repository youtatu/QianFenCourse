package com.qf.course.day12;

import java.util.TreeSet;

/**
 * @author youta
 * @version v1.0
 * @project QianFenCourse
 * @package com.qf.course.day12
 * @company 千锋教育
 * @date 2024/4/17 15:48
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(2);
        ts.add(5);
        ts.add(1);
        ts.add(3);
        ts.add(4);

        System.out.println(ts);
    }
}
