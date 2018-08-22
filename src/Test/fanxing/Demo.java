package Test.fanxing;

public class Demo {
    public <T> void a(T t){
        System.out.printf("t:" + t);
    }

    public static void main(String[] args) {
        new Demo().a("Hello");
        new Demo().<String>a("aa");
    }
}
