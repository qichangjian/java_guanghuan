package Phase2.Task8;

public class Cat implements Animal {
    public String name = "猫";
    @Override
    public void eat(Food food) {
        System.out.println("猫吃" + food);
    }
}
