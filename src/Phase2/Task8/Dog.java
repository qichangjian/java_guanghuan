package Phase2.Task8;

public class Dog implements Animal {
    public String name = "狗";
    @Override
    public void eat(Food food) {
        System.out.println("狗吃" + food);
    }
}
