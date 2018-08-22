package Test.jihe.TestSet;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TestSet4_NavigableSet {
    public static void main(String[] args) {
        //NavigableSet /扩展的 SortedSet，具有了搜索匹配元素方法
        NavigableSet<Double> set = new TreeSet<>();
        set.add(11.1);
        set.add(55.5);
        set.add(22.2);
        set.add(99.9);
        System.out.println(set);
        //小于等于 指定参数的最大整数
        System.out.println(set.floor(20.0)); //11.1

        //大于等于 指定参数的最小元素
        System.out.println(set.ceiling(20.0));

        //返回降序的集合
        System.out.println(set.descendingSet());
        set.descendingSet().forEach(System.out::println);

        //返回降序的迭代器
        set.descendingIterator().forEachRemaining(System.out::println);

        //移除第一个元素
        set.pollFirst();
        set.forEach(System.out::println);

        //移除最后一个元素
        set.pollLast();
        set.forEach(System.out::println);

    }
}
