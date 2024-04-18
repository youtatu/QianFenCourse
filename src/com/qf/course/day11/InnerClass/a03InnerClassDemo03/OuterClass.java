package com.qf.course.day11.InnerClass.a03InnerClassDemo03;

/**
 * @author youta
 * @version v1.0
 * @project QianFenCourse
 * @package com.qf.course.day11.InnerClass.a03InnerClassDemo03
 * @company 千锋教育
 * @date 2024/4/15 17:35
 */
public class OuterClass {

    // 静态内部类
    static class InnerClass {
        public void show1(){
            System.out.println("非静态的方法被调用了");
        }

        public static void show2() {
            System.out.println("静态方法被调用了");
        }
    }

}
