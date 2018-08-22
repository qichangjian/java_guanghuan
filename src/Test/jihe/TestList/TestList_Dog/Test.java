package Test.jihe.TestList.TestList_Dog;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<Dog>();
        Dog meimei = new Dog("美美","拉布拉多",1);
        Dog liangliang = new Dog("亮亮","金毛",2);
        Dog huanhuan = new Dog("欢欢","松狮",3);
        dogs.add(meimei);
        dogs.add(liangliang);
        dogs.add(huanhuan);
        Iterator iterator = dogs.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        dogs.remove(meimei);
        dogs.forEach(dog -> System.out.println(dog));

        MyComparator my = new MyComparator();
        //一个是数组一个是集合 数组是Arrays
        dogs.sort(my);
        dogs.forEach(dog -> System.out.println(dog));
        dogs.sort(null);
        dogs.forEach(dog -> System.out.println(dog));
    }
}
