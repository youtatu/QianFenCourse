package com.qf.course.day09;

import java.util.Arrays;

/**
 * @author youta
 * @version v1.0
 * @project QianFenCourse
 * @package com.qf.course.day09
 * @company 千锋教育
 * @date 2024/3/22 11:37
 */
public class Demo04 {
    public static void main(String[] args) {
        int[] nums = new int[54];
        for (int i = 0; i < nums.length; i++) {
            // 随机生成数据0-53
            int number = (int) (Math.random() * 54);
            // 判断是否有number
            boolean flag = false;
            for (int j = 0; j < i; j++) {
                if (nums[j] == number) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                // 回退
                i--;
                continue;
            }
            nums[i] = number;
        }
        System.out.println(Arrays.toString(nums));

        int[] person1 = Arrays.copyOfRange(nums, 0, 17);
        int[] person2 = Arrays.copyOfRange(nums, 17, 34);
        int[] person3 = Arrays.copyOfRange(nums, 34, 51);
        int[] dipai = Arrays.copyOfRange(nums,51,54);
        String[] box = new String[]{
                "♠️A", "♥️A", "♣️A", "♦️A",
                "♠️2", "♥️2", "♣️2", "♦️2",
                "♠️3", "♥️3", "♣️3", "♦️3",
                "♠️4", "♥️4", "♣️4", "♦️4",
                "♠️5", "♥️5", "♣️5", "♦️5",
                "♠️6", "♥️6", "♣️6", "♦️6",
                "♠️7", "♥️7", "♣️7", "♦️7",
                "♠️8", "♥️8", "♣️8", "♦️8",
                "♠️9", "♥️9", "♣️9", "♦️9",
                "♠️10", "♥️10", "♣️10", "♦️10",
                "♠️J", "♥️J", "♣️J", "♦️J",
                "♠️Q", "♥️Q", "♣️Q", "♦️Q",
                "♠️K", "♥️K", "♣️K", "♦️K",
                "大🃏", "小🃏"
        };
        show(person1,box);
        show(person2,box);
        show(person3,box);
        show(dipai,box);

    }

    private static void show(int[] arr, String[] box) {
        for (int i : arr) {
            System.out.print(box[i] + "," + "\t");
        }
        System.out.println();
    }
}
