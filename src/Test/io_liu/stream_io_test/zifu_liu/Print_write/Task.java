package Test.io_liu.stream_io_test.zifu_liu.Print_write;

import java.io.*;
import java.util.Scanner;

//循环输入姓名存入文本
public class Task {
    public static void main(String[] args) throws IOException {
        //第一种
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("请输入姓名：");

        File f = new File("D:\\IdeaProjects-workspace\\src\\Test\\io_liu\\stream_io_test\\number.txt");

        PrintWriter pw = new PrintWriter(f);
        while(true){
            String input = scanner.next();
            if(input.equals("q")){
                break;
            }else{
                pw.write(input);
                pw.write("\r\n");
            }
        }

        pw.close();*/

        //第二种方法 包装输入流
       /* File f = new File("D:\\IdeaProjects-workspace\\src\\Test\\io_liu\\stream_io_test\\number.txt");
        BufferedReader brf = new BufferedReader(new InputStreamReader(System.in));//将System.in字节流包装为字符流InputStreamReader
        PrintWriter pw = new PrintWriter(f);
        while(true){
            String input = brf.readLine(); //读一行写一行
            if(input.equals("q")){
                break;
            }else{
                pw.write(input);
            }
        }

        pw.close();
        brf.close();*/


       /**try() 自动资源释放
        * 只要实现了 autoable接口就能自动资源释放
        * 将实现了接口的东西放入到try()括号中 就不用关闭流了
        * \**/
        try(
                BufferedReader brf = new BufferedReader(new InputStreamReader(System.in));//将System.in字节流包装为字符流InputStreamReader
                PrintWriter pw = new PrintWriter("D:\\IdeaProjects-workspace\\src\\Test\\io_liu\\stream_io_test\\number.txt");)
        {
            while (true) {
                String input = brf.readLine(); //读一行写一行
                if (input.equals("q")) {
                    break;
                } else {
                    pw.write(input);
                }
            }
        }

    }
}
