package com.qf.course.day11.oop_interface.a01interfaceDemo01;

import com.qf.course.day11.oop_interface.a01interfaceDemo01.Dog;
import com.qf.course.day11.oop_interface.a01interfaceDemo01.Frog;
import com.qf.course.day11.oop_interface.a01interfaceDemo01.Rabbit;

/**
 * @author youta
 * @version v1.0
 * @project QianFenCourse
 * @package com.qf.course.day11.oop_interface
 * @company 千锋教育
 * @date 2024/4/15 8:50
 */
public class Test {
    public static void main(String[] args) {
        // 创建青蛙对象
        Frog frog = new Frog("小青", 10);
        System.out.println(frog.getName() + "," + frog.getAge());
        frog.eat();
        frog.swim();

        // 创建兔子对象
        Rabbit rabbit = new Rabbit("小白", 3);
        System.out.println(rabbit.getName() + "," + rabbit.getAge());
        rabbit.eat();

        // 创建狗对象
        Dog dog = new Dog("大黄", 20);
        System.out.println(dog.getName() + "," + dog.getAge());
        dog.eat();
        dog.swim();
    }
}
