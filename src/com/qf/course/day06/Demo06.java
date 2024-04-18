package com.qf.course.day06;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author youta
 * @version v1.0
 * @project QianFenCourse
 * @package com.qf.course.day06
 * @company 千锋教育
 * @date 2024/4/16 15:25
 */
public class Demo06 {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        for (String string : list) {
            System.out.println(string);
        }
    }
}
