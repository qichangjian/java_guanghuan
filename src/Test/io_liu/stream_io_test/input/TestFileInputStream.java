package Test.io_liu.stream_io_test.input;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//文件流  读 read input
public class TestFileInputStream {
    public static void main(String[] args) throws IOException {
        //1.创建流对象
        //方法一
        FileInputStream fin = new FileInputStream("D:\\IdeaProjects-workspace\\src\\Test\\io_liu\\stream_io_test\\a.txt"); //抛出文件找不到问题FileNotFoundException
        //方法二
        //File f = new File("./a.txt");
        //FileInputStream fin = new FileInputStream(f);

        //2.读取
       /* System.out.println((char)fin.read());//出异常IOException
        System.out.println((char)fin.read());//一次读取一个字节 存了五个字符 hello 知道了 读取五次
        System.out.println((char)fin.read());
        System.out.println((char)fin.read());
        System.out.println((char)fin.read());
        System.out.println(fin.read());//读取 没有后返回-1*/

        //简写
        int temp;
        while((temp = fin.read()) != -1){ //有中文就出错了
            System.out.println((char)temp);
        }

        //3.关闭
        fin.close();

    }
}
