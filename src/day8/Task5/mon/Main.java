package day8.Task5.mon;

public class Main {
    public static void main(String[] args) {
        Monster snake = new Snake("小蛇怪",3000,200);
        snake.attack();
        snake.move();
        snake.setVitality(9);
        ((Snake) snake).addVitality();
        snake.attack();

        Monster centipede = new Centipede("小蜈蚣怪",2000,300);
        centipede.move();
        centipede.attack();
    }
}
