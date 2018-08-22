package day9.Task4;

public class Frog extends Animal implements Run{
    @Override
    void eat() {
        System.out.println("兔子是"+ super.getType() +"，爱吃昆虫");
    }

    @Override
    void voice() {
        System.out.println("那是只" + super.getColor() + "的，名叫" + getName() + "的青蛙正在呱呱的叫");
    }

    @Override
    public void run() {
        System.out.println("虽然不是鱼，但是青蛙也是泳坛高手");
    }

    public Frog() {
    }

    public Frog(String name, String color, String type) {
        super(name, color, type);
    }
}
