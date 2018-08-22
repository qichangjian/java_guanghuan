package Test.io_liu.stream_io_test.printStream;

import java.io.*;

//打印输出字节流
public class TestPrintStream {
    public static void main(String[] args) throws IOException {
        //把一个文件内容读出来在控制台上显示
        //读
        File f = new File("D:\\IdeaProjects-workspace\\src\\Test\\io_liu\\stream_io_test\\a.txt");
        FileInputStream fin = new FileInputStream(f);
        byte[] b = new byte[fin.available()];
        fin.read(b);
        fin.close();
        //写   写到控制台
        PrintStream ps = new PrintStream(System.out);//System.out 属于FIleOutputStream 输出方向是控制台
        ps.println(new String(b,"utf-8")); //相当于System.out.println
        ps.close();
    }
}
