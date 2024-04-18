package com.qf.course.day07;

/**
 * @author youta
 * @version v1.0
 * @project QianFenCourse
 * @package com.qf.course.day07
 * @company 千锋教育
 * @date 2024/4/10 21:06
 */
public class Student {
    private int ID;
    private String name;
    private int age;

    public Student() {
    }

    public Student(int ID, String name, int age) {
        this.ID = ID;
        this.name = name;
        this.age = age;
    }

    public Student(String zhangsan, int i) {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
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
}
