package com.qf.course.day06;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author youta
 * @version v1.0
 * @project QianFenCourse
 * @package com.qf.course.day06
 * @company 千锋教育
 * @date 2024/4/16 15:04
 */
public class Demo05 {
    public static void main(String[] args) {
        Collection<Student> students = new ArrayList<Student>();

        Student s1 = new Student("zhangsan", 23);
        Student s2 = new Student("wangwu", 24);
        Student s3 = new Student("lishi", 21);

        students.add(s1);
        students.add(s2);
        students.add(s3);

        Student s4 = new Student("zhangsan", 23);
        // 这里需要重写equals方法

        System.out.println(students.contains(s4));



    }
}
