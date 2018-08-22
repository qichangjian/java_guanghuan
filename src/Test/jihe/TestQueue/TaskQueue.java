package Test.jihe.TestQueue;

import java.util.ArrayDeque;
import java.util.Deque;

//学员练习：队列
public class TaskQueue {
    static Deque<Person> personDeque = new ArrayDeque<>();
    public static void main(String[] args) {
        Person p1 = new Person(1,"张三");
        Person p2 = new Person(2,"郭靖");
        Person p3 = new Person(3,"杨康");
        Person p4 = new Person(4,"黄蓉");
        Person p5 = new Person(5,"王五");
        personDeque.offer(p1);
        personDeque.offer(p2);
        personDeque.offer(p3);
        personDeque.offer(p4);
        personDeque.offer(p5);

        while(personDeque.size() > 0){
            System.out.println(personDeque.getFirst().toString());
            System.out.println("弹出：" + personDeque.pollFirst());
            ff();
        }

    }
    public static void ff(){
        System.out.println("剩余：");
        if(personDeque.size() > 0){
        personDeque.forEach(System.out::println);
        }else{
            System.out.println("后边没有队伍了");
            System.out.println("全部办理完成");
        }
        System.out.println();
    }
}

class Person{
    public int no;
    public String name;

    public Person(int no, String name) {
        this.no = no;
        this.name = name;
    }

    @Override
    public String toString() {
        return "no=" + no +
                ", name='" + name + "办理完成}"
                ;
    }
}
