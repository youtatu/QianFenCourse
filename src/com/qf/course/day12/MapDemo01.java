package com.qf.course.day12;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author youta
 * @version v1.0
 * @project QianFenCourse
 * @package com.qf.course.day12
 * @company 千锋教育
 * @date 2024/4/17 16:09
 */
public class MapDemo01 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("郭靖","黄蓉");
        map.put("韦小宝","沐剑屏");

        // 方法一
        Set<String> keySet = map.keySet();
        for(String key:keySet){
            System.out.println(key+":"+map.get(key));
        }
        // 方法二
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for(Map.Entry<String, String> entry:entries){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
}
