package com.qf.course.day07;

import java.util.Scanner;

/**
 * @author youta
 * @version v1.0
 * @project QianFenCourse
 * @package com.qf.course.day07
 * @company 千锋教育
 * @date 2024/3/20 11:26
 */

public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        //System.out.println(result);
        for (int i = 1; i <= number; i++) {
            int result = fibonacciSequence(i);
            System.out.println(result);
        }
    }

    private static int fibonacciSequence(int number) {
        if (number == 1 || number == 2) return 1;
        return fibonacciSequence(number - 1) +
                fibonacciSequence(number - 2);
    }
}
