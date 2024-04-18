package com.qf.course.day11.oop_interface.a04interfaceDemo04;

/**
 * @author youta
 * @version v1.0
 * @project QianFenCourse
 * @package com.qf.course.day11.oop_interface.a04interfaceDemo04
 * @company 千锋教育
 * @date 2024/4/15 10:21
 */
public class BasketBallAthlete extends Athlete{
    public BasketBallAthlete() {
    }

    public BasketBallAthlete(String name, int age) {
        super(name, age);
    }

    @Override
    public void learn() {
        System.out.println("学打篮球");
    }
}
