package day14.Task2;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Set<Mouse> mouseSet = new HashSet<>();
        Mouse taotao = new Mouse("淘淘","偷吃大米",3);
        Mouse jierui = new Mouse("杰瑞","调戏猫",1);
        Mouse haha = new Mouse("哈哈","调戏猫",2);
        mouseSet.add(taotao);
        mouseSet.add(jierui);
        mouseSet.add(haha);
        mouseSet.forEach(System.out::println);//因为继承了Comparable接口，所以排序按照我们写的方法排序
        Mouse jierui2 = new Mouse("杰瑞","调戏狗",1);
        mouseSet.add(jierui2);//名字相同，添加不进去
        Iterator<Mouse> iterator = mouseSet.iterator();//迭代器遍历
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        mouseSet.remove(jierui);
        mouseSet.forEach(System.out::println);
        System.out.println("集合中有多少只老鼠：" + mouseSet.size());

    }
}
