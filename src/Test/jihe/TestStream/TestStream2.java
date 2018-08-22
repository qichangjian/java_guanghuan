package Test.jihe.TestStream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestStream2 {
    public static void main(String[] args) {
        //集合转换成流，调用流中方法
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list,11,22,45,68,88,222,11);
        list.stream();//集合转换成stream流
        list.stream().filter(v -> v<55).forEach(System.out::println);
        System.out.println(list.stream().filter(v -> v<44).count());
        list.stream().forEach(System.out::println);

    }
}
