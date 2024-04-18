package com.qf.course.day06;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author youta
 * @version v1.0
 * @project QianFenCourse
 * @package com.qf.course.day06
 * @company 千锋教育
 * @date 2024/4/16 14:57
 */
public class Demo04 {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<String>();
        collection.add("a");
        collection.add("b");
        collection.add("c");
        System.out.println(collection);
        boolean result = collection.contains("a");
        System.out.println(result);
    }
}
