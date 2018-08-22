package Test.jihe.TestSet;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TestSet3 {
    public static void main(String[] args) {
        //sortedSet sorted是有序的
        //TreeSet排序 自然顺序排序
        //二叉树：每个树最多只有两个节点
        Set<Integer> set1 = new TreeSet<>();
        SortedSet<Integer> set = new TreeSet<>();
        set.add(111);
        set.add(33);
        set.add(35);
        System.out.println(set);
        //第一个
        System.out.println(set.first());
        //最后一个
        System.out.println(set.last());
        //子集，【）
        System.out.println(set.subSet(33,111));
        System.out.println(set.subSet(33,123));




    }
}
