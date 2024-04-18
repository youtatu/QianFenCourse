package com.qf.course.day08;

import java.util.Scanner;

/**
 * @author youta
 * @version v1.0
 * @project QianFenCourse
 * @package com.qf.course.day08
 * @company 千锋教育
 * @date 2024/4/11 14:02
 */
public class StringDemo4 {
    public static void main(String[] args) {
        String rightUsername = "wang";
        String rightPassword = "123456";
        int i = 0;
        while(i < 3){
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入用户名:");
            String username = sc.next();
            System.out.println("请输入密码:");
            String password = sc.next();

            if(username.equals(rightUsername) && password.equals(rightPassword)){
                System.out.println("输入正确");
            }else{
                if(2-i > 0)
                    System.out.println("输入错误,请重新输入,还剩"+(3-i-1)+"次机会");
                else{
                    System.out.println("账户已锁定");
                }
            }
            i++;
        }


    }
}
