package Phase2.Task5;

public class Drinks extends Water implements filter,buffer {

    @Override
    void water() {
        System.out.print("饮料一：原材料：水");
    }
}
