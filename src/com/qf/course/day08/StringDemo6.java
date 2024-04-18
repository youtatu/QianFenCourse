package com.qf.course.day08;

/**
 * @author youta
 * @version v1.0
 * @project QianFenCourse
 * @package com.qf.course.day08
 * @company 千锋教育
 * @date 2024/4/11 14:54
 */
public class StringDemo6 {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3};
        String s = arrToString(arr);
        System.out.println(s);
    }
    public static String arrToString(int[] arr){
        if(arr == null)
            return "";
        if(arr.length == 0)
            return "[]";

        StringBuilder result= new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length - 1){
                result.append(arr[i]);
            }else
                result.append(arr[i]).append(", ");
        }
        return result.append("]").toString();
    }
}
