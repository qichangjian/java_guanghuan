package Test.jihe.TestList.ListTest;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
//2.list方法
public class TestList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aa");//0
        list.add("bb");//1
        list.add("cc");//2
        System.out.println(list);
        //向索引位置添加位置，因为list有顺序
        list.add(1,"ff");
        //获得索引处的元素
        System.out.println(list.get(0));
        //修改特定位置的元素
        list.set(1,"Hello");
        System.out.println(list);
        //指定元素第一次出现的位置索引
        list.add("aa");
        System.out.println(list.indexOf("aa"));
        //最后一次出现的位置索引
        System.out.println(list.lastIndexOf("aa"));
        //取子集合(不包括终止位置)
        System.out.println(list.subList(1,3));
        //list本身有个排序方法莫不是所有的都有
        list.sort(null);//空对象按照自然升序排序
        System.out.println(list);
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        list.sort((o1,o2)->o2.compareTo(o1));

    }
}
