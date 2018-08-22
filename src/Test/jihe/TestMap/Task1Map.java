package Test.jihe.TestMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Task1Map {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("PBC","农业银行");
        map.put("ICBC","工商银行");
        map.put("BC","中国银行");
        map.put("CBC","建设银行");
        System.out.println(map);

        System.out.println("BC对应银行是：" + map.get("BC"));
        System.out.println("banks中一共有几组数据：" + map.size());
        map.remove("BC");
        System.out.println("bank中包含BC的key吗？" + map.containsKey("BC"));
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map);

        //-----------遍历
        System.out.println("遍历");
        map.forEach((k,v) -> System.out.println(k+":"+v));

        Set<Map.Entry<String,String>> mapSet = map.entrySet();
        Iterator<Map.Entry<String,String>> iterator = mapSet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
            //System.out.println(iterator.next().getKey());
            //System.out.println(iterator.next().getValue());
        }




    }

}
