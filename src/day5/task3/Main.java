package day5.task3;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("测试1",12,1);
        Person p2 = new Person("测试2",33,2);
        p1.addAge(p1.getAge());
        p2.setAge(11);
        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }
}
