package Test.io_liu.stream_io_test.bufferedTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class scannerTest {
    public static void main(String[] args) throws FileNotFoundException {
        //                       数据源
        Scanner sc = new Scanner(System.in);// System.in 是一个 FileInputStream
        //是否是数据 has   是true ,false
        if(sc.hasNextInt()){
            int num = sc.nextInt();
        }else{
            System.out.println("输入的不是数字");
        }
        //关上输入流
        sc.close();

        //-----------------------------------------------------
        FileInputStream fin = new FileInputStream("D:\\IdeaProjects-workspace\\src\\Test\\io_liu\\stream_io_test\\c.txt");
        Scanner sc1 = new Scanner(fin);//更换数据源   从流里读取
        String s = sc1.next();
        System.out.println(s);

        //------------------------------------------------------
        Scanner sc2 = new Scanner("aa bb cc");
        String s0 = sc2.next();//得不到空格 见到空格就不读了
        String s1 = sc2.nextLine();//可以得到空格
        System.out.println(s0);
        System.out.println(s1);

    }
}
