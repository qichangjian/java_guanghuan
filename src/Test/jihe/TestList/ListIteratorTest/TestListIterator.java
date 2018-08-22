package Test.jihe.TestList.ListIteratorTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

/**3.遍历集合list*/
public class TestListIterator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aa");
        list.add("bb");
        list.add("cc");
        //1.基本for 只适应于list，因为有索引
        System.out.println("-------基本for------");
        for (int i = 0; i < list.size() ; i++) {
            System.out.println(list.get(i));
        }
        //2.增强for 所有的都适用
        System.out.println("-------增强for------");
        for (String s: list) {
            System.out.println(s);
        }
        //3.集合的方法
        System.out.println("------集合方法------");
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);//s是集合元素
            }
        });
        list.forEach(s -> System.out.println(s));
        list.forEach(System.out::println);//方法引用

        //4.Iterator 迭代器方法  iterator next hasNext  remove
        System.out.println("-------Iterator------");
        Iterator<String> i = list.iterator();//每个list都有iterator方法，用来遍历集合 的
        while (i.hasNext()){
            System.out.println(i.next());
        }
        //5.Iterator 迭代器方法
        Iterator<String> ii = list.iterator();
        ii.forEachRemaining(System.out::println);

        //6.ListIterator接口（针对list）： List接口的子接口
        System.out.println("-----------迭代器子接口ListIterator接口--------");
        ListIterator<String> li = list.listIterator();
        while (li.hasNext()){
            System.out.println(li.next());
            li.add("hello");//可以加入别的操作
        }
        //向下迭代
        System.out.println("向下迭代");
        ListIterator<String> lii = list.listIterator();
        while (lii.hasNext()){
            System.out.println(lii.next());
        }
        //向上迭代 类似 倒叙输出
        System.out.println("向上迭代");
        while (li.hasPrevious()){
            System.out.println(li.previous());
        }

        //7.steam流的方式
        System.out.println("------------stream流的方式--------");
        list.stream().forEach(System.out::println);

    }
}
