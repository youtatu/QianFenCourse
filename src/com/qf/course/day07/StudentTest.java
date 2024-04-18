package com.qf.course.day07;



/**
 * @author youta
 * @version v1.0
 * @project QianFenCourse
 * @package com.qf.course.day07
 * @company 千锋教育
 * @date 2024/4/10 21:08
 */
public class StudentTest {
    public static void main(String[] args) {

        Student[] students = new Student[3];

        Student student1 = new Student(1, "小明", 20);
        Student student2 = new Student(2, "小红", 17);
         Student student3 = new Student(3, "小黑", 22);
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;

        Student student4 = new Student(4, "小蓝", 22);
        // 进行id判断 添加元素
        boolean flag = contains(students, student4.getID());
        if (flag) {
            // 在的话就不添加
            System.out.println("当前id已存在,请修改id的值");
        } else {
            int count = GetCount(students);
            if (count == students.length) {
                // 2. 数组已满,创建新的数组再添加
                // 创建新数组 = 老数组长度 + 1
                // 把老数组的元素,拷贝到新数组当中
                Student[] newStudents = createNewStudents(students);
                newStudents[count] = student4;

                // 遍历新数组  使用方法
                traverseArray(newStudents);
            } else {
                // 1.数组不满,直接添加
                students[count] = student4;

                // 遍历旧数组 使用方法
                traverseArray(students);
            }
        }

        // 根据id删除元素
        int index = getIndex(students,3);
        if (index >= 0){
            students[index] = null;
            traverseArray(students);
        }

        else{
            System.out.println("id不存在" );
        }
    }

    //定义一个数组扩容的方法
    public static Student[] createNewStudents(Student[] students) {
        int newLength = students.length + 1;
        Student[] newStudents = new Student[newLength];
        System.arraycopy(students, 0, newStudents, 0, students.length);
        return newStudents;
    }

    // 定义一个方法,判断数组元素个数
    public static int GetCount(Student[] students) {
        int count = 0;
        for (Student student : students) {
            if (student != null)
                count++;
        }
        return count;
    }

    // 1. 我要干什么    做唯一性判断
    // 2. 我干这件事儿,需要什么才能完成  数组+ id
    // 3. 调用处是否需要继续使用方法的结果 不需要

    // 定义一个方法判断是否包含id
    public static boolean contains(Student[] students, int id) {
        for (Student student : students) {
            // 这里如果是空的话无法调用方法
            if(student != null) {
                if (student.getID() == id)
                    return true;
            }
        }
        return false;
    }

    // 定义一个遍历数组的方法
    public static void traverseArray(Student[] students){
        for (Student student : students) {
            if(student != null)
                System.out.println(student.getID() +","+ student.getName()+","+student.getAge());
        }
    }

    // 定义一个方法实现找到Id在数组中的索引,根据索引删除
    public static int getIndex(Student[] students, int id){
        // 先找到元素下标
        for (int i = 0; i < students.length; i++) {
            Student student = students[i];
            if (student != null) {
                int sid = student.getID();
                if (sid == id)
                    return i;
            }
        }
        return -1;
    }
}
