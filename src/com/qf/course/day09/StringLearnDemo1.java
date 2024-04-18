package com.qf.course.day09;

import java.util.Scanner;
import java.util.StringJoiner;

/**
 * @author youta
 * @version v1.0
 * @project QianFenCourse
 * @package com.qf.course.day09
 * @company 千锋教育
 * @date 2024/4/12 10:06
 */
public class StringLearnDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        while (true) {

            str = sc.next();

            // 校验字符串
            boolean flag = checkStr(str);
            if(flag)
                break;
            else{
                System.out.println("输入错误");
            }
        }
        
        int len = str.length();
        StringJoiner sj = new StringJoiner(" ","[","]");
        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            // int number = ch - 48;
            int number = Character.getNumericValue(ch);
            // int number = (int) ch;
            sj.add(changeLuoMa(number));
        }
        System.out.println(sj);
    }

    private static String changeLuoMa(int number) {
        String[] arr= {"", "I", "II", "III", "IV", "V", "VI",
                "VII", "VIII", "IX"};
        return arr[number];
    }


    private static boolean checkStr(String str) {
        int len = str.length();
        if(len - 9 > 0)
            return false;
        else {
            for (int i = 0; i < len; i++) {
                char c = str.charAt(i);
                if(c < '0' || c > '9')
                    return false;
            }
        }
        return true;
    }
}
