package com.qf.course.day07;

/**
 * @author youta
 * @version v1.0
 * @project QianFenCourse
 * @package com.qf.course.day07
 * @company 千锋教育
 * @date 2024/4/10 11:59
 */
public class GameTest {
    public static void main(String[] args) {
        Role r1 = new Role("乔峰",100,'男');
        Role r2 = new Role("鸠摩智",100,'女');
        // 展示一下角色信息
        r1.showRoleInfo();
        r2.showRoleInfo();

        // 回合制游戏
        while(true){
            // r1攻击r2
            r1.attack(r2);
            // 判断r2剩余血量
            if(r2.getBlood() == 0) {
                System.out.println(r1.getName() + "K.O" + r2.getName());
                break;
            }
            // r1攻击r2
            r2.attack(r1);
            // 判断r1剩余血量
            if(r1.getBlood() == 0) {
                System.out.println(r2.getName() + "K.O" + r1.getName());
                break;
            }
        }
    }
}
