package day14.Task1;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        //定义企鹅的集合
        List<Penguin> penguinList = new ArrayList<>();
        //定义多个企鹅并加入到集合
        Penguin penguin = new Penguin("张三");
        Penguin penguin1 = new Penguin("李四");
        Penguin penguin2 = new Penguin("王五");
        Penguin penguin3 = new Penguin("赵六");
        penguinList.add(penguin);
        penguinList.add(penguin1);
        penguinList.add(penguin2);
        penguinList.add(penguin3);

        //查看集合中企鹅的数量
        System.out.println("企鹅的数量：" + penguinList.size());
        //遍历企鹅的信息
        penguinList.forEach(System.out::println);
        //删除集合中索引值为2的企鹅的元素
        penguinList.remove(2);
        System.out.println("删除索引2后的企鹅信息：");
        penguinList.forEach(System.out::println);

    }
}
