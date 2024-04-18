package com.qf.course.day11.oop_interface.a02interfaceDemo02;

import java.util.Scanner;

/**
 * @author youta
 * @version v1.0
 * @project QianFenCourse
 * @package com.qf.course.day11.oop_interface.a02interfaceDemo02
 * @company 千锋教育
 * @date 2024/4/15 9:14
 */
public class Test {
    public static void main(String[] args) {
        // 创建实现类对象并调用
        InterMpl interMpl = new InterMpl();
        interMpl.method();

        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
    }
}
