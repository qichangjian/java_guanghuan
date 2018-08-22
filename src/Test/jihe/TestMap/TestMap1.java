package Test.jihe.TestMap;

import java.util.HashMap;
import java.util.Map;

public class TestMap1 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        //添加信息
        map.put(1,"张三");
        map.put(2,"李四");
        map.put(3,"王五");
        System.out.println(map);

        //size查看键值对的书面
        System.out.println(map.size());
        //isEmpty() 集合是否为空
        System.out.println(map.isEmpty());
        //是否存在 键 containsKey
        System.out.println(map.containsKey(2));
        //是否存在 值 containsVale
        System.out.println(map.containsValue("张三"));
        //remove 删除某个元素 根据指定的键
        map.remove(2);
        System.out.println(map);
        //keySet 获取集合中键的集合
        System.out.println(map.keySet());
        //values 获取集合中值的集合
        System.out.println(map.values());
        //clear 清空集合
        map.clear();
        System.out.println(map);

        //添加信息
        map.put(1,"张三");
        map.put(2,"李四");
        map.put(null,null);//hashMap支持空键和空值，不是所有的
        map.put(3,"王五");
        System.out.println(map);

        map.put(1,"键相同后put");
        System.out.println(map);



    }
}
