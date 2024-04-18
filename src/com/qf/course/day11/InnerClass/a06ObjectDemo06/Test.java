package com.qf.course.day11.InnerClass.a06ObjectDemo06;

/**
 * @author youta
 * @version v1.0
 * @project QianFenCourse
 * @package com.qf.course.day11.InnerClass.a06ObjectDemo06
 * @company 千锋教育
 * @date 2024/4/16 10:11
 */
public class Test {
    public static void main(String[] args) {
        String s = "abs";
        StringBuilder sb = new StringBuilder(s);
        System.out.println(s.equals(sb));
        System.out.println(sb.equals(s));
    }
}
