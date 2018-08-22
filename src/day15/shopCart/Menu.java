package day15.shopCart;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    static List<Good> goodList = new ArrayList<>();
    static {
        Good good1 = new Good(1,"aa",11.1);
        Good good2 = new Good(2,"bb",22.2);
        Good good3 = new Good(3,"cc",33.3);
        Good good4 = new Good(4,"dd",44.4);
        Good good5 = new Good(5,"ee",55.5);
        goodList.add(good1);
        goodList.add(good2);
        goodList.add(good3);
        goodList.add(good4);
        goodList.add(good5);
    }

    public static void mainMenu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------------菜单-------------------");
        System.out.println("  1.添加 2.修改数量 3.删除商品 4.查询全部 5.退出");
        System.out.println("-------------------------------------------------");
        System.out.println("  编号\t\t 商品名称\t\t 商品单价\t\t");
        getGoodsList();
        System.out.println("-------------------------------------------------");
        judgeInput(getInput(3));
    }
    public static void judgeInput(int inputChoose){
        switch (inputChoose){
            case 1:
                inputAdd();//添加
            case 2:
                inputAdd();//修改也是调用添加的方法
            case 3:
                inputDelete(); //删除
            case 4:
                CartOperator.selectGood();//查询
            case 5:
                System.exit(0);//退出
            default:
                errorTip();
                mainMenu();
        }
    }

    public static void getGoodsList(){
        goodList.forEach(System.out::println);
    }

    public static void inputAdd(){
        int inputno = getInput(1);
        Good good = getInputNoGood(inputno);
        CartOperator.addGood(good,getInput(2));
    }

    public static void inputDelete(){
        CartOperator.deleteGood(getInputNoGood(getInput(1)));
    }

    //根据编号返回一个good
    public static Good getInputNoGood(int inputNo){
        Good returnGood = null;
        for (int i = 0; i < goodList.size(); i++) {
            if(goodList.get(i).getGoodNo() == inputNo){
                returnGood = goodList.get(i);
            }
        }
        if(returnGood == null){
            errorTip();
            inputAdd();
        }
        return returnGood;
    }

    public static void errorTip(){
        System.out.println("Input No Error");
    }

    public static int getInput(int flag){
        Scanner sc = new Scanner(System.in);
        if(flag == 1){
            System.out.println("请输入商品编号：");
            return sc.nextInt();
        }else if(flag == 2){
            System.out.println("请输入商品个数：");
            return sc.nextInt();
        }else{
            System.out.println("--请输入选择：");
            return sc.nextInt();
        }
    }
}
