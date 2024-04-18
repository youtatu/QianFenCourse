package com.qf.course.day09;

import java.util.Arrays;
import java.util.Scanner;



/**
 * @author youta
 * @version v1.0
 * @project QianFenCourse
 * @package com.qf.course.day09
 * @company 千锋教育
 * @date 2024/4/12 11:43
 */
public class StringDemo01 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
        String strA = "abcde";
        String strB = "cdeab";

        boolean result = check(strA,strB);

        System.out.println(result);
    }

    private static boolean check(String strA, String strB) {
        for (int i = 0; i < strA.length(); i++) {
            strA = rotate(strA);
            if(strA.equals(strB))
                return true;
        }
        return false;
    }

    private static String rotate(String str) {
        char[] charArray = str.toCharArray();

        // 字符依次前移
        int i = 0,j = 1;
        char first = charArray[i];
        while(j < charArray.length){
            charArray[i++]=charArray[j++];
        }
        charArray[charArray.length - 1] = first;
        return new String(charArray);
    }
}
