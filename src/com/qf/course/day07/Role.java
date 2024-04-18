package com.qf.course.day07;

import java.util.Random;

/**
 * @author youta
 * @version v1.0
 * @project QianFenCourse
 * @package com.qf.course.day07
 * @company 千锋教育
 * @date 2024/4/10 11:07
 */
public class Role {
    // 私有成员变量
    public String name;
    private int blood;
    private char gender;
    // 要求长相随机
    private String face;
    String[] boyFaces = {"风流俊雅", "气宇轩昂", "相貌英俊", "五官端正", "相貌平平", "一塌糊涂", "面目狰狞"};
    String[] girlFaces = {"美奂绝伦", "沉鱼落雁", "婷婷玉立", "身材娇好", "相貌平平", "相貌简陋", "惨不忍睹"};

    // attack 攻击描述：
    String[] attacks_desc = {
            "%s使出了一招【背心钉】，转到对方的身后，一掌向%s背心的灵台穴拍去。",
            "%s使出了一招【游空探爪】，飞起身形自半空中变掌为抓锁向%s。",
            "%s大喝一声，身形下伏，一招【劈雷坠地】，捶向%s双腿。",
            "%s运气于掌，一瞬间掌心变得血红，一式【掌心雷】，推向%s。",
            "%s阴手翻起阳手跟进，一招【没遮拦】，结结实实的捶向%s。",
            "%s上步抢身，招中套招，一招【劈挂连环】，连环攻向%s。"
    };

    // injured 受伤描述：
    String[] injureds_desc = {
            "结果%s退了半步，毫发无损",
            "结果给%s造成一处瘀伤",
            "结果一击命中，%s痛得弯下腰",
            "结果%s痛苦地闷哼了一声，显然受了点内伤",
            "结果%s摇摇晃晃，一跤摔倒在地",
            "结果%s脸色一下变得惨白，连退了好几步",
            "结果『轰』的一声，%s口中鲜血狂喷而出",
            "结果%s一声惨叫，像滩软泥般塌了下去"
    };

    public Role() {
    }

    public Role(String name, int blood, char gender) {
        this.name = name;
        this.blood = blood;
        this.gender = gender;
        // 随机长相
        setFace(gender);
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getFace() {
        return face;
    }

    public void setFace(char gender) {
        Random r = new Random();
        // 长相随机的
        if (gender == '男') {
            //从boyFaces里面随机
            this.face = boyFaces[r.nextInt(boyFaces.length)];
        } else if (gender == '女') {
            // 从girlFaces里面随机
            this.face = girlFaces[r.nextInt(girlFaces.length)];
        } else {
            this.face = "相貌平平";
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public void attack(Role role) {
        // 随机招式描述
        Random r = new Random();
        String kunFu = attacks_desc[r.nextInt(attacks_desc.length)];

        // 输出一个攻击效果
        System.out.printf(kunFu, this.getName(), role.getName());
        // 换行
        System.out.println();

        // 伤害是一个1-20的随机血量
        // Random r = new Random();
        int hurt = r.nextInt(20) + 1;

        // 修改挨揍的人的血量
        int remainBoold = role.getBlood() - hurt;
        // 剩余血量验证,负数时返回0
        remainBoold = Math.max(remainBoold, 0);
        // 修改一下挨揍人的血量
        role.setBlood(remainBoold);

        // 受伤描述,这个需要判断血量去匹配
        if (role.getBlood() > 90){
            System.out.printf(injureds_desc[0], role.getName());
        } else if (role.getBlood() > 80) {
            System.out.printf(injureds_desc[1], role.getName());
        } else if (role.getBlood() > 70) {
            System.out.printf(injureds_desc[2], role.getName());
        } else if (role.getBlood() > 60) {
            System.out.printf(injureds_desc[3], role.getName());
        } else if (role.getBlood() > 40) {
            System.out.printf(injureds_desc[4], role.getName());
        } else if (role.getBlood() > 30) {
            System.out.printf(injureds_desc[5], role.getName());
        } else if (role.getBlood() > 10) {
            System.out.printf(injureds_desc[6],role.getName());
        }else {
            System.out.printf(injureds_desc[7],role.getName());
        }

        // 打印完受伤后在换一个行
        System.out.println();
        /*// this表示方法调用者,其实就是this去攻击role
        System.out.println(this.getName()+ "举起拳头打了"+role.getName() +
                "一下,造成了"+hurt+"伤害,"+role.getName()+"还剩下"+remainBoold+"血量");*/
    }

    // 显示角色信息
    public void showRoleInfo() {

        System.out.println("姓名为:" + getName());
        System.out.println("血量为:" + getBlood());
        System.out.println("性别为:" + getGender());
        System.out.println("长相为:" + getFace());
    }
}
