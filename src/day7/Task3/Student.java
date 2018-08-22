package day7.Task3;

public class Student {
    public static int waterQ= 1000;
    private int cup = 0;

    {
        System.out.println("构造块执行-------------");
    }

    public void addCup(){
        System.out.println("接水前杯中水量" + this.getCup());
        int addNumber = 100 - this.getCup();
        System.out.println("接水" + addNumber + "！");
        waterQ = waterQ - addNumber;
        this.setCup(100);
        System.out.println("水杯已经接满----------------");
    }

    public void downCup(){
        this.setCup(this.getCup() - 10);
    }

    public void printMessage(){
        System.out.println("饮水机中水量为：" + waterQ );
        System.out.println("该同学水杯中的水量：" + this.getCup());
    }

    public Student() {
    }

    public Student(int cup) {
        this.cup = cup;
    }

    public int getCup() {
        return cup;
    }

    public void setCup(int cup) {
        this.cup = cup;
    }

    @Override
    public String toString() {
        return "Student{" +
                "cup=" + cup +
                '}';
    }
}
