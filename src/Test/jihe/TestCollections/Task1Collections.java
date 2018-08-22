package Test.jihe.TestCollections;

import java.util.*;

public class Task1Collections {
    public static void main(String[] args) {
        List<String> studentList = new ArrayList<>();
        Collections.addAll(studentList,"张三","王五","王五","李四","李四");
        /*studentList.add("张三");
        studentList.add("李四");
        studentList.add("李四");
        studentList.add("王五");
        studentList.add("王五");*/
        studentList.forEach(System.out::println);


        Set<String> studentSet = new HashSet<>();
        System.out.println("重复的元素");
        for (int i = 0; i < studentList.size(); i++) {
            if(Collections.frequency(studentList,studentList.get(i)) > 1){
                studentSet.add(studentList.get(i));
            }
        }
        studentSet.forEach(System.out::println);

    }
}
