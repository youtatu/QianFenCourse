package com.qf.course.day11.oop_interface.a01interfaceDemo01;

/**
 * @author youta
 * @version v1.0
 * @project QianFenCourse
 * @package com.qf.course.day11.oop_interface
 * @company 千锋教育
 * @date 2024/4/15 8:41
 */
public class Rabbit extends Animal {

    public Rabbit() {
    }

    public Rabbit(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("吃萝卜");
    }
}
