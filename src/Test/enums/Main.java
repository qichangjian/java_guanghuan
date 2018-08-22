package Test.enums;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Man.MALE.setName("男");
        System.out.printf(Man.MALE.getName());
        Scanner sc = new Scanner(System.in);
        System.out.printf("input sex:");
        //Man input = Man.MALE;
        Man input = Man.valueOf(sc.next());
        switch (input){
            case MALE:
                System.out.printf("nan");
                break;
            case FEMALE:
                System.out.printf("nv");
                break;
        }
    }
}
