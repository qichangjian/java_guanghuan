package day8.Task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请选择pizza类型：1 培根披萨  2海鲜披萨");
        Pizza pizza = null;
        int choose = sc.nextInt();
        if(choose == 1){
            pizza = new PgPizza("培根披萨",36.7,"大");
        }else if(choose == 2){
            pizza = new HxPizza("海鲜披萨",34.2,"小");
        }else{
            pizza = new Pizza();
        }
        pizza.show();
    }
}
