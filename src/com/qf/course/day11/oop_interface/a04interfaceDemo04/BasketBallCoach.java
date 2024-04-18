package com.qf.course.day11.oop_interface.a04interfaceDemo04;

/**
 * @author youta
 * @version v1.0
 * @project QianFenCourse
 * @package com.qf.course.day11.oop_interface.a04interfaceDemo04
 * @company 千锋教育
 * @date 2024/4/15 10:23
 */
public class BasketBallCoach extends Coach{
    public BasketBallCoach() {
    }

    public BasketBallCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("教篮球");
    }
}
