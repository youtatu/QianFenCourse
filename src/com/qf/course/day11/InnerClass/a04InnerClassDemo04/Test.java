package com.qf.course.day11.InnerClass.a04InnerClassDemo04;

import com.qf.course.day11.oop_interface.a01interfaceDemo01.Swim;

/**
 * @author youta
 * @version v1.0
 * @project QianFenCourse
 * @package com.qf.course.day11.InnerClass.a04InnerClassDemo04
 * @company 千锋教育
 * @date 2024/4/15 19:00
 */
public class Test {
    public static void main(String[] args) {
        // 编写匿名内部类的代码
        new Swim(){
            @Override
            public void swim() {
                System.out.println("重写了游泳的方法");
            }
        };
    }
}
