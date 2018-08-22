package Test.io_liu.stream_io_test.input;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestFileInputStream2 {
    public static void main(String[] args) throws IOException {
        //1.创建流对象
        File file = new File("D:\\IdeaProjects-workspace\\src\\Test\\io_liu\\stream_io_test\\a.txt");
        FileInputStream fin = new FileInputStream(file); //抛出文件找不到问题FileNotFoundException
        //转换为字符流
        InputStreamReader ir = new InputStreamReader(fin);//包装后可以将字节装换成字符

        //2.读取
        /*int temp;
        while ((temp = ir.read()) != -1) { //可以读中文了
            System.out.println((char) temp);
        }*/
        //byte[] b = new byte[(int)file.length()];//file.length 得到long 內容長度
        byte[] b = new byte[fin.available()];
        //把读取到的 字节数组 大小的数据存到 字节数组b 中，返回读到的字节总数
        fin.read(b);
        //往字节数组的起始位置存储，存几个
        //fin.read(b,2,2);
        //
        String s = new String(b,"utf-8");//  可以指定编码方式
        System.out.println(s);

        //3.关闭
        fin.close();
    }
}
