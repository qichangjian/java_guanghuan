package Test.testKaoshi;

//instance of 多态
public class testInstanceof {
    public static void main(String[] args) {
        Fish fish = new Fish();
        Man man = new Man();
        getSwim(fish);
        getSwim(man);
    }

    public static void getSwim(Swim swim){
        Swim s = null;
        if(swim instanceof Fish){
            s = new Fish();
            s.run();
        }else{
            s = new Man();
            s.run();
        }
    }
}


interface Swim{
    void run();
}
class Fish implements Swim{

    @Override
    public void run() {
        System.out.println("fish");
    }
}
class Man implements Swim{
    @Override
    public void run() {
        System.out.println("man");
    }
}
