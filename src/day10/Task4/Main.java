package day10.Task4;

public class Main {
    public static void main(String[] args) {
        Taste taste1 = () -> System.out.println("这苹果味道不错");
        taste1.taste();

        Drive drive1 = wheather -> {
            System.out.println("今天天气是" + wheather);
            System.out.println("直升机飞行稳定");
        };
        drive1.drive("晴空万里");

        Add add1 = (int a,int b) -> {return a + b;};

        System.out.println("1 + 2 = " + add1.add(1,2));

    }

    interface Taste {
        void taste();
    }

    interface Drive {
        void drive(String wheather);
    }

    interface Add{
        int add(int a,int b);
    }


}
