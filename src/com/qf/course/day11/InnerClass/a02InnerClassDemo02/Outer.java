package com.qf.course.day11.InnerClass.a02InnerClassDemo02;

/**
 * @author youta
 * @version v1.0
 * @project QianFenCourse
 * @package com.qf.course.day11.InnerClass.a02InnerClassDemo02
 * @company 千锋教育
 * @date 2024/4/15 14:49
 */
public class Outer {
    private int a = 10;
    class Inner{
        public int a = 20;

        public void show(){
            int a = 30;
            System.out.println(Outer.this.a);
            System.out.println(this.a);
            System.out.println(a);
        }
    }

}
