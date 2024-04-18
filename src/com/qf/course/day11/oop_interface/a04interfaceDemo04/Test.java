package com.qf.course.day11.oop_interface.a04interfaceDemo04;

/**
 * @author youta
 * @version v1.0
 * @project QianFenCourse
 * @package com.qf.course.day11.oop_interface.a04interfaceDemo04
 * @company 千锋教育
 * @date 2024/4/15 10:14
 */
public class Test {
    public static void main(String[] args) {
        // 创建对象篮球教练
        BasketBallCoach basketCoach = new BasketBallCoach("老黑",30);
        System.out.println(basketCoach.getName()+","+basketCoach.getAge());
        basketCoach.teach();
        System.out.println();

        // 创建对象 篮球运动员
        BasketBallAthlete basketAthlete = new BasketBallAthlete("小黑",20);
        System.out.println(basketAthlete.getName() +","+basketAthlete.getAge());
        basketAthlete.learn();
        System.out.println();

        // 创建对象 乒乓球教练
        TableTennisCoach tennisCoach = new TableTennisCoach("老白",45);
        System.out.println(tennisCoach.getName()+","+tennisCoach.getAge());
        tennisCoach.teach();
        tennisCoach.learnEnglish();
        System.out.println();

        // 创建对象 乒乓球运动员
        TableTennisAthlete tennisAthlete = new TableTennisAthlete("小白",20);
        System.out.println(tennisAthlete.getName()+","+tennisAthlete.getAge());
        tennisAthlete.learn();
        tennisAthlete.learnEnglish();
        System.out.println();
    }
}
