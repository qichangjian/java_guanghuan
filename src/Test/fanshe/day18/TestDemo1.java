package Test.fanshe.day18;

//直接调用加载器
public class TestDemo1 {
    static{
        System.out.println("static");
    }

    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("Test.fanshe.day18.TestDemo1");
    }
}
