package Test.testKaoshi;

public class Test_this {
    public static void main(String[] args) {
        Child c = new Child();
        c.printall();
        //test();//出错，静态方法不能调用非静态方法
    }

    public void test(){

    }
}

class Parent{
    void printMe(){
        System.out.println("P");
    }
}

class Child extends Parent{
    @Override
    void printMe() {
        System.out.println("C");
    }

    void  printall(){
        super.printMe();
        this.printMe();
        printMe();
        test();
        tests();
        dd();
    }

    public void test(){

    }

    void tests(){

    }

    private void dd(){

    }
}
