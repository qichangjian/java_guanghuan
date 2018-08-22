package day7.Task3;

public class Main {
    public static void main(String[] args) {
        Student a = new Student();
        Student b = new Student();
        Student c = new Student();

        a.addCup();
        a.printMessage();
        a.downCup();
        a.printMessage();
        a.downCup();
        a.printMessage();

        b.addCup();
        b.printMessage();
        for (int i = 0; i < 10 ; i++) {
            b.downCup();
            b.printMessage();
        }
        b.addCup();
        b.printMessage();

        c.addCup();
        b.printMessage();
        for (int i = 0; i < 7; i++) {
            c.downCup();
            b.printMessage();
        }
        System.out.println("----------------总结：-----------------------");
        System.out.println("饮水机中水量为" + Student.waterQ);
        System.out.println("a水杯中水量为：" + a.getCup());
        System.out.println("b水杯中水量为：" + b.getCup());
        System.out.println("c水杯中水量为：" + c.getCup());
    }
}
