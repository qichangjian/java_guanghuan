package Test.io_liu.stream_io_test.bufferedTest;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * 循环输入姓名，把姓名输入文件c.txt
 */
public class Task1 {
    public static void main(String[] args) throws IOException {
        //                        数据源
        Scanner sc = new Scanner(System.in);
        String name = null;
        while(true){
            System.out.println("请输入学员姓名：");
            name = sc.next();

            if(name.equals("q")){
                break;
            }
            writeName(name);
        }
    }
    public static void writeName(String name) throws IOException {
        //节点流
        FileOutputStream fout = new FileOutputStream("D:\\IdeaProjects-workspace\\src\\Test\\io_liu\\stream_io_test\\c.txt",true);
        //缓冲流
        BufferedOutputStream bfout = new BufferedOutputStream(fout);

        //写入字符串
        bfout.write(name.getBytes());
        bfout.write("\r\n".getBytes());//换行

        //强制刷新
        bfout.flush();

        //关闭流
        bfout.close();
    }

}
