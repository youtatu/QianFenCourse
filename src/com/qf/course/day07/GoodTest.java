package com.qf.course.day07;

/**
 * @author youta
 * @version v1.0
 * @project QianFenCourse
 * @package com.qf.course.day07
 * @company 千锋教育
 * @date 2024/4/10 16:42
 */
public class GoodTest {
    public static void main(String[] args) {
        Goods[] arr = new Goods[3];
        Goods g1 = new Goods("001","huawei",9000.0,90);
        Goods g2 = new Goods("002","xiaomi",8000.0,90);
        Goods g3 = new Goods("003","shanxin",4000.0,90);

        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;

        for (Goods goods : arr) {
            System.out.println(goods.getId() + "," + goods.getName() + "," + goods.getPrice() + "," + goods.getCount());
        }
    }
}
