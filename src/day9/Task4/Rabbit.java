package day9.Task4;

public class Rabbit extends Animal {
    @Override
    void eat() {
        System.out.println("兔子是"+ super.getType() +"，爱吃胡萝卜");
    }

    @Override
    void voice() {
        System.out.println("那是只" + super.getColor() + "的，名叫" + getName() + "的兔子正在叽叽的叫");
    }

    public Rabbit() {
    }

    public Rabbit(String name, String color, String type) {
        super(name, color, type);
    }
}
