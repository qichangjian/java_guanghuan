package ATM;

import java.util.Scanner;

import static ATM.Main.accountIndex;
import static ATM.Main.accounts;

public class Menu {
    public static void mainMenu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("---------ATM管理系统---------");
        System.out.println("\t1.登录 2.开户 0.退出");
        System.out.println("-----------------------------");
        System.out.println("---输入选择：");
        int choose = sc.nextInt();
        switch (choose){
            case 1:
                //login
                login();
                break;
            case 2:
                //开户
                openAccount();
                break;
            case 0:
                //退出
                System.exit(0);
            default:
                System.out.println("-------输入错误！--------");
                mainMenu();
        }
    }

    public static void openAccount(){
        Scanner sc = new Scanner(System.in);
        System.out.println("---请输入密码：");
        String pwd = sc.next();
        Account account = new Account();
        account.setAccount(account.getAccount() + accountIndex);
        Main.accounts[accountIndex] = account;
        System.out.println("账户信息：" + account.toString());
        accountIndex ++;
        mainMenu();
    }

    public static void login(){
        Scanner sc = new Scanner(System.in);
        System.out.println("---请输入卡号：");
        int inputNo = sc.nextInt();
        System.out.println("---请输入密码：");
        String inputPwd = sc.next();
        for (int i = 0; i < accountIndex; i++) {
            if(inputNo == accounts[i].getAccount() && inputPwd.equals(accounts[i].getPwd())){
                //登录成功记录当前账号
                Main.loginAccount = i;
                myMainMenu();
            }
        }
        mainMenu();
    }

    public static void myMainMenu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------主菜单----------------");
        System.out.println("\t1.存钱 2.取钱 3.转账 4.查询余额 0.退出");
        System.out.println("-------------------------------------------");
        System.out.println("---输入选择：");
        int choose = sc.nextInt();
        switch (choose){
            case 1:
                //存钱
                addMoney();
                break;
            case 2:
                //取钱
                downMoney();
                break;
            case 3:
                //转账
                changeMoney();
                break;
            case 4:
                //查询余额
                lookMoney();
                break;
            case 0:
                //退出
                mainMenu();
                Main.accountIndex = 0;
            default:
                System.out.println("-------输入错误！--------");
                myMainMenu();
        }
    }

    public static void addMoney(){
        System.out.println("您的余额是：" + accounts[Main.loginAccount].getMoney());
        Scanner sc = new Scanner(System.in);
        System.out.println("--请输入您要存钱的金额：");
        double add = sc.nextDouble();
        accounts[Main.loginAccount].setMoney(accounts[Main.loginAccount].getMoney() + add);
        System.out.println("存钱成功");
        System.out.println("您的余额是：" + accounts[Main.loginAccount].getMoney());
        myMainMenu();
    }

    public static void downMoney(){
        System.out.println("您的余额是：" + accounts[Main.loginAccount].getMoney());
        Scanner sc = new Scanner(System.in);
        System.out.println("--请输入您要取出钱的金额：");
        double down = sc.nextDouble();
        if(down > accounts[Main.loginAccount].getMoney()){
            System.out.println("余额不足！");
            downMoney();
        }else{
            accounts[Main.loginAccount].setMoney(accounts[Main.loginAccount].getMoney() - down);
        }
        System.out.println("取钱成功");
        System.out.println("您的余额是：" + accounts[Main.loginAccount].getMoney());
        myMainMenu();
    }

    public static void changeMoney(){
        System.out.println("您的余额是：" + accounts[Main.loginAccount].getMoney());
        Scanner sc = new Scanner(System.in);
        System.out.println("--请输入您要转账的账户：");
        int chageAccount = sc.nextInt();
        for (int i = 0; i < accountIndex; i++) {
            if(chageAccount == accounts[i].getAccount()){
                System.out.println("--请输入您要转账的金额：");
                double down = sc.nextDouble();
                if(down > accounts[Main.loginAccount].getMoney()){
                    System.out.println("余额不足！");
                    changeMoney();
                }else{
                    accounts[Main.loginAccount].setMoney(accounts[Main.loginAccount].getMoney() - down);
                    accounts[i].setMoney(accounts[i].getMoney() + down);
                }
                System.out.println("转账成功");
                System.out.println("您的余额是：" + accounts[Main.loginAccount].getMoney());
                myMainMenu();
            }
        }
        System.out.println("没有该账户!");
        changeMoney();
    }

    public static void lookMoney(){
        System.out.println("您的余额是：" + accounts[Main.loginAccount].getMoney());
        myMainMenu();
    }
}
