package com.qf.course.day10;

/**
 * @author youta
 * @version v1.0
 * @project QianFenCourse
 * @package com.qf.course.day10
 * @company 千锋教育
 * @date 2024/4/12 16:54
 */
public class StaticDemo01 {
    private String name;
    private int age;
    private String gender;

    public StaticDemo01() {
    }


    public StaticDemo01(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void study(){
        System.out.println(name + "学习中...");
    }

    public void show(){

    }
}
