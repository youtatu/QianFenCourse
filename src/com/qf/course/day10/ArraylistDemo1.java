package com.qf.course.day10;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author youta
 * @version v1.0
 * @project QianFenCourse
 * @package com.qf.course.day10
 * @company 千锋教育
 * @date 2024/4/12 15:10
 */
public class ArraylistDemo1 {
    public static void main(String[] args) {
        // ArrayList<String> list = new ArrayList<String>();
        ArrayList<Student> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        int i = 2;
        while(i > 0){
            Student st = new Student();
            System.out.println("请输入学生姓名");
            String name = sc.next();
            System.out.println("请输入学生年龄");
            int age = sc.nextInt();
            // 把值送回去
            st.setName(name);
            st.setAge(age);
            list.add(st);
            i--;
        }


        for (Student student : list) {
            System.out.println(student.getName() + "," + student.getAge());

        }


    }
}
