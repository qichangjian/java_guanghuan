package day9.Task5;

public class Main {
    public static void main(String[] args) {
        NormalEmployee normalEmployee = new NormalEmployee();
        System.out.println("普通员工出勤补助费：" + normalEmployee.getDecMoney(4));

        Director director = new Director();
        System.out.println("经理出勤补助费：" + director.getDecMoney(4));
    }
}
