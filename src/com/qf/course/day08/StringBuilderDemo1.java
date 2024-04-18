package com.qf.course.day08;

import java.util.Scanner;

/**
 * @author youta
 * @version v1.0
 * @project QianFenCourse
 * @package com.qf.course.day08
 * @company 千锋教育
 * @date 2024/4/11 16:23
 */
public class StringBuilderDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        String reverseStr = new StringBuilder().append(str).reverse().toString();

        if(str.equals(reverseStr)){
            System.out.println("当前字符串是对称字符串");
        }else{
            System.out.println("当前字符串不是对称字符串");
        }
    }
}
