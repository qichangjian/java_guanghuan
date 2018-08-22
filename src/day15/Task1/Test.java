package day15.Task1;

import java.util.ArrayDeque;
import java.util.Deque;

public class Test {
    public static void main(String[] args) {
        Deque<Libray> librayDeque = new ArrayDeque<>();
        Libray libray = new Libray(1,"巴黎圣母院",33);
        Libray libray1 = new Libray(2,"完美世界",100);
        Libray libray2 = new Libray(4,"斗破",90);
        Libray libray3 = new Libray(3,"大主宰",90);
        //压栈
        librayDeque.push(libray);
        librayDeque.push(libray1);
        librayDeque.push(libray2);
        librayDeque.push(libray3);
        librayDeque.forEach(System.out::println);
        //弹栈
        while(librayDeque.size() > 0){
            System.out.println(librayDeque.pop());
        }

    }
}
