package Test.jihe.TestQueue;

import java.util.LinkedList;
import java.util.Queue;

//Collection子接口Queue的方法 队列 先进先出
public class TestQueue {
    public static void main(String[] args) {
        Queue<String> queueString = new LinkedList<>();
        ////入队 插入尾部
        //add 添加成功 true 失败引发异常
        queueString.add("aa");
        queueString.add("bb");
        //offer 添加成功 true 失败false
        queueString.offer("cc");
        queueString.forEach(System.out::println);
        ////出队 移除第一个 返回移除的元素
        //remove 失败返回异常
        System.out.println(queueString.remove());
        System.out.println(queueString.remove());
        //失败返回null
        System.out.println(queueString.poll());

        //队列不允许加入 null 值  但是LinkedList特殊可以加入，建议不要使用
        //queueString.offer(null);

        //循环出队
        System.out.println("---------循环出队----------");
        queueString.add("aa");
        queueString.add("bb");
        while(queueString.size() > 0){
            System.out.println(queueString.poll());
        }

        //获得表头元素
        System.out.println("----------");
        System.out.println(queueString.peek());
        System.out.println(queueString.element());

    }
}
