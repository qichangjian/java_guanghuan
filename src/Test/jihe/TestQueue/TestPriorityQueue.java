package Test.jihe.TestQueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class TestPriorityQueue {
    public static void main(String[] args) {
        //优先队列
        // 好处 可以排序
        // 缺点：违背了队列先进先出原则
        Queue<Integer> q = new PriorityQueue<>();
        q.add(22);
        q.add(55);
        q.add(11);
        //q.forEach(System.out::println);//这个输出方式不对
        //这个可以排序 违背了队列先进先出原则
        while(q.size() > 0){
            System.out.println(q.poll());
        }

    }
}
