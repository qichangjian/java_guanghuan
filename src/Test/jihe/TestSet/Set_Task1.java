package Test.jihe.TestSet;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

//生成七个随机数1-30 不重复，set可以去重
public class Set_Task1 {
    public static void main(String[] args) {
        Set<Integer> integers = new HashSet<>();
        Random random = new Random();
        while(true){
            if(integers.size() <  7){
                integers.add(random.nextInt(30+1));
            }else{
                break;
            }
        }
        integers.forEach(System.out::println);
    }
}
