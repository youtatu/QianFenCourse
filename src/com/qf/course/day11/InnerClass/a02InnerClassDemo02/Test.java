package com.qf.course.day11.InnerClass.a02InnerClassDemo02;

import org.omg.CORBA.Object;

import java.util.Scanner;

/**
 * @author youta
 * @version v1.0
 * @project QianFenCourse
 * @package com.qf.course.day11.InnerClass
 * @company 千锋教育
 * @date 2024/4/15 14:48
 */
public class Test {
    public static void main(String[] args) {
        Outer.Inner inner = new Outer().new Inner();
        inner.show();

        Scanner sc = new Scanner(System.in);
        String next = sc.next();
    }
}
