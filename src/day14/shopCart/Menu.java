package day14.shopCart;

import day8.Task1.Car;

import java.util.Scanner;

public class Menu{
    public static void mainMenu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------------菜单-------------------");
        System.out.println("  1.添加 2.修改数量 3.删除商品 4.查询全部 5.退出");
        System.out.println("-------------------------------------------------");
        System.out.println("--请输入选择：");
        int inputChoose = sc.nextInt();
        switch (inputChoose){
            case 1:
                //添加
                inputAdd();
            case 2:
                //修改
                inputUpdate();
            case 3:
                //删除
                inputDelete();
            case 4:
                //查询
                CartOperator.selectGood();
            case 5:
                //退出
                System.exit(0);
            default:
                System.out.println("输入错误，自动返回主菜单。。。");
                mainMenu();
        }
    }

    public static void inputAdd(){
        /*Scanner sc = new Scanner(System.in);
        System.out.println("请输入编号：");
        int inputNo = sc.nextInt();
        System.out.println("请输入姓名：");
        String inputName = sc.next();
        System.out.println("请输入价格：");
        double inputPrice = sc.nextDouble();
        System.out.println("请输入数量：");
        int inputNum = sc.nextInt();
        Good good = new Good(inputNo,inputName,inputPrice,inputNum);*/
        Good good = inputMessage();
        CartOperator.addGood(good);
    }

    public static void inputUpdate(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改的编号：");
        //查询是否存在该编号存在修改，不存在重新输入
        int inputNo = sc.nextInt();
        isHaveThisNoGood(inputNo,1);
    }
    public static void isHaveThisNoGood(int inputNo,int flag){
        for (int i = 0; i < CartOperator.cart.size(); i++) {
            if(CartOperator.cart.get(i).getGoodNo() == inputNo) {
                if (flag == 1){
                    Good good = inputMessage();
                    CartOperator.updateGood(i, good);
                }else if(flag == 2){
                    CartOperator.deletGood(i);
                }
            }
        }
        System.out.println("没有该编号的商品请重新输入：");
        if (flag == 1){
            inputUpdate();
        }else if(flag == 2){
            inputDelete();
        }

    }
    public static void inputDelete(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的编号：");
        //查询是否存在该编号存在删除，不存在重新输入
        int inputNo = sc.nextInt();
        isHaveThisNoGood(inputNo,2);
    }

    public static Good inputMessage(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入编号：");
        int inputNo = sc.nextInt();
        System.out.println("请输入姓名：");
        String inputName = sc.next();
        System.out.println("请输入价格：");
        double inputPrice = sc.nextDouble();
        System.out.println("请输入数量：");
        int inputNum = sc.nextInt();
        Good good = new Good(inputNo,inputName,inputPrice,inputNum);
        return good;
    }
}
