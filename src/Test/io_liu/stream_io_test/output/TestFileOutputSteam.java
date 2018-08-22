package Test.io_liu.stream_io_test.output;

import java.io.FileOutputStream;
import java.io.IOException;

//输出
public class TestFileOutputSteam {
    public static void main(String[] args) throws IOException {
        //把一个字符串，存到b.txt文件中

        //1.创建流对象 第二个参数 false 会覆盖 true 会追加
        FileOutputStream fout = new FileOutputStream("D:\\IdeaProjects-workspace\\src\\Test\\io_liu\\stream_io_test\\b.txt",false);//没有自动创建，但是父路径要有


        //2.写入
        //单个写入
        fout.write('h');//写入一个字节
        fout.write('g');//再写入一个

        //一次写入多个
        String s = "hello您好";
        //输入一个bytes数组
        byte [] b = s.getBytes();
        fout.write(b);//写入要抛出异常
        //要写的字节数组，从字节数组的起始位置字符写入，长度两个
        fout.write(b, 2, 2);


        //3.关闭
        fout.close();
    }
}
