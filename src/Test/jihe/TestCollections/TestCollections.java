package Test.jihe.TestCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCollections {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        //通过Collections向集合添加元素
        Collections.addAll(list,"aa","bb","cc");
        System.out.println(list);

        //排序
        //自然排序
        Collections.sort(list);
        System.out.println(list);
        //自己制定方式排序
        //Collections.sort(list,(s1,s2) -> s2.compareTo(s1));
        System.out.println(list);
        //查找参数元素在集合中出现的索引  前提升序排序 二分查找法查找元素
        System.out.println(Collections.binarySearch(list,"aa"));

        //集合中最小和最大值
        System.out.println(Collections.min(list));
        System.out.println(Collections.max(list));
        //查找某个元素在集合中出现的次数
        list.add("aa");
        System.out.println(list);
        System.out.println(Collections.frequency(list,"aa"));
        //集合元素进行反转
        Collections.reverse(list);
        System.out.println(list);
        //集合元素的洗牌 也就是打乱集合中元素的顺序
        Collections.shuffle(list);
        System.out.println(list);
        //集合的填充，用参数来替换集合中的每个元素
        Collections.fill(list,"XXX");
        System.out.println(list);


    }
}
