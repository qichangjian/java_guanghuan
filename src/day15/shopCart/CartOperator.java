package day15.shopCart;

import java.util.HashMap;
import java.util.Map;

public class CartOperator {
    static Map<Good,Integer> cart = new HashMap<>();

    public static void selectGood(){
        if(cart.size() == 0){
            System.out.println("购物车中没有商品");
            Menu.mainMenu();
        }else{
            System.out.println("  编号\t\t 商品名称\t\t 商品单价\t\t 数量");
            cart.forEach((k,v) -> System.out.println(k + "\t\t" + v));
            Menu.mainMenu();
        }
    }

    public static void addGood(Good good,int no){
        cart.put(good,no);
        Menu.mainMenu();
    }

    public static void deleteGood(Good good){
        cart.remove(good);
        Menu.mainMenu();
    }

}
