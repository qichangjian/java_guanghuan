package Phase3.Part3.Task3;

import java.io.Serializable;

public class Shop implements Serializable {
    //反序列化的时候解决版本号不同的问题  如果不加入，类修改后，因为版本号不同，所以不能够反序列化
    private static final long serialVersionUID = 1L;//设置版本号为1

    private int no;
    private String name;
    private double money;

    public Shop() {
    }

    public Shop(int no, String name, double money) {
        this.no = no;
        this.name = name;
        this.money = money;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", money=" + money +
                '}';
    }
}
