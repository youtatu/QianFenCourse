package com.qf.course.day08;

import java.util.Scanner;

/**
 * @author youta
 * @version v1.0
 * @project QianFenCourse
 * @package com.qf.course.day08
 * @company 千锋教育
 * @date 2024/4/11 14:31
 */
public class StringDemo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String str = sc.next();

        // 定义三个计数器
        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z')
                smallCount++;
            else if (c >= 'A' && c <= 'Z')
                bigCount++;
            else if (c >= '0' && c <= '9')
                numberCount++;
        }
        System.out.println("大写字母个数为:" + bigCount + "小写字母个数为:" + smallCount + "数字个数为:" + numberCount);
    }
}
