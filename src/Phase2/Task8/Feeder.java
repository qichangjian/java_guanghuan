package Phase2.Task8;

public class Feeder implements Animal {

    void feed(Animal animal,Food food){
        System.out.println(animal + "吃" + food);
    }

    @Override
    public void eat(Food food) {
        System.out.println("吃" + food);
    }
}
