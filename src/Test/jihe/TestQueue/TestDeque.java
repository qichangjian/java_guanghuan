package Test.jihe.TestQueue;

import java.util.ArrayDeque;
import java.util.Deque;

public class TestDeque {
    public static void main(String[] args) {
        //Deque双端队列
        //------------------------模拟 队列
        Deque<String> d = new ArrayDeque<>();
        d.add("aa");
        d.addLast("bb");
        d.offer("cc");
        d.offerLast("dd");
        d.forEach(System.out::println);
        //出队
        while(d.size() > 0){
            System.out.println(d.pollFirst());
        }

        //------------------------模拟栈
        System.out.println("----------------");
        Deque<String> dd = new ArrayDeque<>();
        dd.add("aa");
        dd.addFirst("bb");
        dd.offerFirst("dd");
        //栈的方法加入
        dd.push("dd");
        dd.forEach(System.out::println);

        //出栈
        System.out.println("出栈");
        while(dd.size() > 0){
            //System.out.println(dd.pollFirst());
            System.out.println(dd.pop());
        }
    }
}
