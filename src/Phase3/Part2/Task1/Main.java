package Phase3.Part2.Task1;

import day14.Task1.Penguin;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        Person zhangsan = new Person("zhangsan",18,3000);
        Person lisi = new Person("lisi",24,3500);
        Person wangwu = new Person("wangwu",22,3200);
        Person zhaoliu = new Person("zhaoliu",24,3300);
        personList.add(zhangsan);
        personList.add(lisi);
        personList.add(wangwu);
        personList.forEach(System.out::println);
        personList.add(1,zhaoliu);
        personList.forEach(System.out::println);
        personList.remove(wangwu);
        personList.forEach(System.out::println);

        System.out.println("--------------迭代器输出--------");
        Iterator<Person> iterator = personList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
    }
}
