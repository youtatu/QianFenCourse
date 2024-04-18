package com.qf.course.day07;

import java.util.Scanner;

/**
 * @author youta
 * @version v1.0
 * @project QianFenClass
 * @package com.qf.course.day07
 * @company 千锋教育
 * @date 2024/3/20 11:16
 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        dataExistenceJudgment(number);
    }
    private static void dataExistenceJudgment(int number) {
        int[] arr = new int[]{12, 23, 45, 56};
        boolean flag = false;
        for (int i : arr) {
            if(i == number){
                System.out.println("YES");
            }else{
                flag = true;
            }
        }
        if(!flag){
            System.out.println("NO");
        }
    }
}
