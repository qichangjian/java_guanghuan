package Phase2.Task5;

public class Drinks3 extends Water implements filter,sugar {
    @Override
    void water() {
        System.out.print("饮料三：原材料：水");
    }
}
