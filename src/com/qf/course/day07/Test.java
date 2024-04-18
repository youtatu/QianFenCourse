package com.qf.course.day07;

import java.util.Scanner;

/**
 * @author youta
 * @version v1.0
 * @project QianFenCourse
 * @package com.qf.course.day07
 * @company 千锋教育
 * @date 2024/4/10 14:29
 */
public class Test {
    public static void main(String[] args) {

        // 键盘录入
        // nextInt(); 接收整数
        // nextDouble(); 接收小数
        // next(); 接收字符串

        // nextLine(); 接收字符串

        /*Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int num = sc.nextInt();
        System.out.println(num);
        System.out.println("请输入第二个整数");
        int num2 = sc.nextInt();
        System.out.println(num2);

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个字符串");
        String str1 = sc.next();
        System.out.println(str1);
        System.out.println("请再输入一个字符串");
        String str2 = sc.next();
        System.out.println(str2);*/


        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String line1 = sc.nextLine();
        System.out.println(line1);
    }
}

