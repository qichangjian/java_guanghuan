package Test.jihe.TestMap;

import java.util.*;
import java.util.function.BiConsumer;

public class TestMap2 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        //添加信息
        map.put(1,"张三");
        map.put(2,"李四");
        map.put(3,"王五");
        //------------------遍历map
        //1.foreach方式遍历
        // 匿名内部类
        map.forEach(new BiConsumer<Integer, String>() {
            @Override
            public void accept(Integer integer, String s) {
                System.out.println(integer + ":" + s);
            }
        });
        //lambda表达式
        map.forEach((k,v) -> System.out.println(k + ":" + v));

        //2.迭代器分别遍历
        //分别遍历
        map.keySet().iterator().forEachRemaining(System.out::println);
        map.values().iterator().forEachRemaining(System.out::println);
        //3. entrySet方式 得到一个键值对的集合，然后遍历
        Set<Map.Entry<Integer,String>> set =  map.entrySet();
        //输出键值对
        set.forEach(e -> System.out.println(e));//e是键值对
        //单独获得
        set.forEach(e-> System.out.println(e.getKey()));
        set.forEach(e-> System.out.println(e.getValue()));
        //3.2迭代器
        Set<Map.Entry<Integer,String>> set1 =  map.entrySet();
        Iterator<Map.Entry<Integer,String>> i = set1.iterator();
        i.forEachRemaining(System.out::println);

        //------------------------------
        Set<String> s = new HashSet<>();
        s.add("s");//set就是通过map创建的
    }
}
