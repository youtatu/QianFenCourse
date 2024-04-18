package com.qf.course.day08;

import java.util.StringJoiner;

/**
 * @author youta
 * @version v1.0
 * @project QianFenCourse
 * @package com.qf.course.day08
 * @company 千锋教育
 * @date 2024/4/11 15:16
 */
public class StringDemo7 {
    public static void main(String[] args) {
        String str = "after;fmfgavskvn";
        String newStr = reverse(str);
        System.out.println(newStr);
    }

    public static String reverse(String str) {
        //
        StringJoiner result = new StringJoiner(",","[","]");
        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            result.add(String.valueOf(c));
        }
        return result.toString();
    }
}
