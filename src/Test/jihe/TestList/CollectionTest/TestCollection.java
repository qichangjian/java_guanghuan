package Test.jihe.TestList.CollectionTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

/*1.collection接口方法中的方法*/
public class TestCollection {
    public static void main(String[] args) {
        //collection接口方法
        Collection<String> c = new ArrayList<>();
        //集合中元素是否为空
        System.out.println(c.isEmpty());
        //添加集合元素
        c.add("aa");
        c.add("bb");
        c.add("cc");
        System.out.println(c);
        //集合中元素的个数
        System.out.println(c.size());
        //另一个集合的元素添加到当前集合中
        ArrayList<String> c1 = new ArrayList<>();
        c1.add("dd");
        c1.add("ff");
        System.out.println(c1);
        c.addAll(c1);
        System.out.println(c);
        //删除指定参数的元素
        c.remove("aa");
        System.out.println(c);
        //删除 参数集合的所有元素
        c.removeAll(c1);
        System.out.println(c);
        c.add("eeeee");
        c.add("fffffff");
        //按照条件删除
        c.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length() > 2;
            }
        });
        //lambda表达式
        c.removeIf(t -> t.length() > 2);
        //是否包含某个元素
        System.out.println(c.contains("b"));
        System.out.println(c.contains("bb"));
        //是否存在参数集合中的全部元素
        System.out.println(c.containsAll(c1));
        //把数组转换成集合
        /**ArraysList是Arrays的静态内部类  也就是得到的list
         这种ArrayList不能添加和移除元素
        通常是遍历使用
         【注意：数组可以转换为集合，但是转换出来的结合有限制】
         */
        List<String> list = Arrays.asList(new String[]{"ee","ff","dd"});
        //list.add("jj");//报错
        System.out.println(list);
        c.addAll(list);
        System.out.println(c.containsAll(c1));
        //集合转数组
        Object[] obj = c.toArray();
        String[] strs = c.toArray(new String[0]);//会自动扩容
        for (Object o:obj) {
            System.out.println(o);
        }
        for (String s:strs) {
            System.out.println(s);
        }
        //清空集合中的元素
        c.clear();
        System.out.println(c.isEmpty());
    }
}
