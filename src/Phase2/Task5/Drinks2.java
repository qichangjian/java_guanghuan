package Phase2.Task5;

public class Drinks2 extends Water implements buffer,heating {
    @Override
    void water() {
        System.out.print("饮料二：原材料：水");
    }
}
