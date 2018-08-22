package Test.enums;

import static Test.enums.DengPao.RED;

public class Test implements ChangeColor{
    public static void main(String[] args) {
        DengPao d = new Test().changeColor(DengPao.RED);
        System.out.println(d);

    }

    @Override
    public DengPao changeColor(DengPao dengpao) {
        switch (dengpao){
            case RED:
                return DengPao.GREEN;
            case GREEN:
                return DengPao.WHITE;
            default:
                return DengPao.RED;
        }
    }
}
