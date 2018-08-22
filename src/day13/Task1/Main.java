package day13.Task1;

import day13.Task1.Box;

public class Main {
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>(11,22) ;
        Box<Double> doubleBox = new Box<>(11.2,22.3);
        Box<String> stringBox = new Box<>("ddd","aaa");
    }
}
