package day4;

import java.util.Scanner;

/**
 * 图书管理系统；
 */
public class Task8 {
    static String[] bookNo = new String[100];
    static String[] bookName = new String[100];
    static double[] bookPrice = new double[100];
    static int indexFlag = 0;

    public static void main(String[] args) {
        menu();
    }

    public static void menu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("*****************菜单*********************");
        System.out.println("1.添加\t2.修改\t3.删除\t4.查询\t5.退出");
        System.out.println("******************************************");
        System.out.println("--请输入选择：");
        int chooseInput = sc.nextInt();
        switch (chooseInput){
            case 1:
                //添加
                addbook();
                break;
            case 2:
                //修改
                updateBook();
                break;
            case 3:
                //删除
                deleteBook();
                break;
            case 4:
                //查询
                queryBook();
                break;
            case 5:
                System.exit(0);
        }
    }

    public static void addbook(){
        Scanner sc = new Scanner(System.in);
        System.out.println("输入图书编号：");
        String inputNo = sc.next();
        System.out.println("输入图书名称：");
        String inputName = sc.next();
        System.out.println("输入图书价格：");
        double inputPrice = sc.nextDouble();
        if(indexFlag<100){
            bookNo[indexFlag] = inputNo;
            bookName[indexFlag] = inputName;
            bookPrice[indexFlag] = inputPrice;
            indexFlag ++;
            menu();
        }else{
            System.out.println("数组存放满了！！！");
            menu();
        }
    }
    public static void updateBook(){
        Scanner sc = new Scanner(System.in);
        System.out.println("--请输入要更新的编号：");
        String inputno = sc.next();
        //根据编号查询下标
        int updateno = queryNo(inputno);
        if(updateno == -1){
            updateBook();
        }else{
            System.out.println("输入图书编号：");
            bookNo[updateno]  = sc.next();
            System.out.println("输入图书名称：");
            bookName[updateno] = sc.next();
            System.out.println("输入图书价格：");
            bookPrice[updateno] = sc.nextDouble();
        }
        menu();
    }
    public static void deleteBook(){
        Scanner sc = new Scanner(System.in);
        System.out.println("--请输入要删除的编号：");
        String inputno = sc.next();
        int deleteno = queryNo(inputno);
        if(deleteno == -1){
            deleteBook();
        }else{
            //数组往前移动一位
            for (int i = deleteno; i > indexFlag; i++) {
                bookNo[i] = bookNo[i+1];
                bookName[i] = bookName[i+1];
                bookPrice[i] = bookPrice[i-1];
            }
            indexFlag --;
            menu();
        }
    }
    public static void queryBook(){
        System.out.println("编号\t名称\t\t单价");
        for (int i = 0; i < indexFlag; i++) {
            System.out.println("  " + bookNo[i] + "\t" + bookName[i] + "\t\t" + bookPrice[i]);
        }
        System.out.println();
        menu();
    }

    public static int queryNo(String inputno){
        int flag = -1;
        for (int i = 0; i < indexFlag; i++) {
            if(bookNo[i].equals(inputno)){
                flag = i;
                return flag;
            }
        }
        System.out.println("未找到此数据！");
        return flag;
    }
}
