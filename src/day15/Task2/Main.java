package day15.Task2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map<String,String> ht = new HashMap<>();
        ht.put("CA","加拿大(CANADA)");
        ht.put("CF","中非(CENTRAL AFRICA)");
        ht.put("CG","刚果(CONGO)");
        ht.put("CH","瑞士(SWITZERLAND)");
        ht.put("CL","智利(CHILE)");
        ht.put("CM","喀麦隆(CAMEROON)");
        ht.put("CN","中国(CHINA)");
        ht.put("CO","哥伦比亚(COLOMBIA)");
        ht.put("CR","哥斯达黎加(COSTA RICA)");
        ht.put("CS","捷克(CZECH REPUBIC)");
        ht.put("CU","古巴(CUBA)");
        ht.put("CY","塞浦路斯(CYPRUS)");
        ht.put("CN","中国(CHINA)");
        ht.put("DE","德国(GERMANY)");
        ht.put("DK","丹麦(DENMARK)");
        ht.put("DO","多米尼加共和国(DOMINICAN REPUBLIC)");
        ht.put("DZ","阿尔及利亚(ALGERIA)");

        if(ht.containsKey("CA")){
            System.out.println(ht.get("CA"));
        }else{
            System.out.println();
        }

        System.out.println("集合中一共有多少个国家：" + ht.size());

        System.out.println("国家简称：");
        for (String s:ht.keySet()) {
            System.out.print(s + "\t");
        }
        for(String s:ht.values()){
            System.out.println(s + "\t");
        }

        System.out.println("输出全部：");
        Set<Map.Entry<String,String>> mapSet = ht.entrySet();
        Iterator<Map.Entry<String,String>> iterator = mapSet.iterator();
        while(iterator.hasNext()){
            Map.Entry<String,String> map= iterator.next();
            System.out.println(map.getKey() + "—" + map.getValue());
        }
        //方法2
        Set<Map.Entry<String,String>> mapSet2 = ht.entrySet();
        for(Map.Entry<String,String> m:mapSet2){
            System.out.println(m.getKey() + ":" + m.getValue());
        }

        //两种方式简写
        for (Map.Entry<String,String> entry: ht.entrySet()) {
            System.out.println(entry.getKey() + entry.getValue());
        }
        Iterator<Map.Entry<String,String>> iterator1 = ht.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String,String> s = iterator.next();
            System.out.println(s.getKey() + s.getValue());
        }






    }
}
