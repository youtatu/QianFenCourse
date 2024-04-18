package com.qf.course.day07;

/**
 * @author youta
 * @version v1.0
 * @project QianFenCourse
 * @package com.qf.course.day07
 * @company 千锋教育
 * @date 2024/4/10 20:32
 */
public class PhoneTest {
    public static void main(String[] args) {
        Phone[] phones = new Phone[3];

        Phone p1 = new Phone("小米", 1000, "红色");
        Phone p2 = new Phone("华为",2000,"蓝色");
        Phone p3 = new Phone("苹果",3000,"紫色");

        phones[0] = p1;
        phones[1] = p2;
        phones[2] = p3;

        int price = 0;
        for (Phone phone : phones) {
            price += phone.getPrice();
        }
        price /= phones.length;
        System.out.println(price);
        // BigDecimal 实现精确运算
    }
}
