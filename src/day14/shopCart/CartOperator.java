package day14.shopCart;

import java.util.ArrayList;
import java.util.List;

public class CartOperator {
    static List<Good> cart = new ArrayList<>();

    //添加
    public static void addGood(Good good){
        cart.add(good);
        System.out.println("添加成功！");
        Menu.mainMenu();
    }
    //查询商品
    public static void selectGood(){
        if(cart.size() == 0){
            System.out.println("没有商品");
            Menu.mainMenu();
        }else {
            for (Good good : cart) {
                System.out.println(good);
            }
            Menu.mainMenu();
        }
    }

    //修改商品
    public static void updateGood(int i,Good good){
        cart.set(i,good);
        System.out.println("修改成功");
        Menu.mainMenu();
    }

    //删除商品
    public static void deletGood(int i){
        cart.remove(i);
        System.out.println("删除成功");
        Menu.mainMenu();
    }
}
