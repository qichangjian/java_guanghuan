package Test.testKaoshi;

public class Deme2 {
    private int age = print22();//不能放在构造块下边会报错

    {
        age = 33;
        System.out.println("构造块" + age);
    }

    public int print22(){
        age = 22;
        System.out.println("声明处初始化：" + age);
        return age;
    }

    public Deme2() {
        this.age = 44;
        System.out.println("构造方法：" + age);
    }

    public static void main(String[] args) {
        Deme2 d = new Deme2();

        System.out.println(d.age);
    }
}
