package com.qf.course.day11.oop_interface.a04interfaceDemo04;

/**
 * @author youta
 * @version v1.0
 * @project QianFenCourse
 * @package com.qf.course.day11.oop_interface.a04interfaceDemo04
 * @company 千锋教育
 * @date 2024/4/15 10:17
 */
public abstract class Coach extends Person{
    public Coach() {
    }

    public Coach(String name, int age) {
        super(name, age);
    }

    public abstract void teach();
}
