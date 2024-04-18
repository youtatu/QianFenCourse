package com.qf.course.day12;

import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * @author youta
 * @version v1.0
 * @project QianFenCourse
 * @package com.qf.course.day12
 * @company 千锋教育
 * @date 2024/4/17 14:49
 */
public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("张三", 10);
        Student s2 = new Student("李四", 10);
        Student s3 = new Student("王五", 10);
        Student s4 = new Student("张三", 10);

        LinkedHashSet<Student> lhs = new LinkedHashSet<Student>();

        lhs.add(s1);
        lhs.add(s2);
        lhs.add(s3);
        lhs.add(s4);
        System.out.println(lhs);

    }
}
