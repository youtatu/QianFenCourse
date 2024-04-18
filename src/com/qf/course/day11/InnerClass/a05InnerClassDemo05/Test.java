package com.qf.course.day11.InnerClass.a05InnerClassDemo05;

/**
 * @author youta
 * @version v1.0
 * @project QianFenCourse
 * @package com.qf.course.day11.InnerClass.a05InnerClassDemo05
 * @company 千锋教育
 * @date 2024/4/15 19:35
 */
public class Test {
    public static void main(String[] args) {
        method(
            new Animal() {
                @Override
                public void eat() {
                    System.out.println("狗吃骨头");
                }
            }
        );

    }

    public static void method(Animal a) {
        a.eat();
    }
}
