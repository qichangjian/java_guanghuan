package Test.io_liu.stream_io_test.input;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

//读取中文
public class TestFileInputStream1 {
    public static void main(String[] args) throws IOException {
        //1.创建流对象
        FileInputStream fin = new FileInputStream("D:\\IdeaProjects-workspace\\src\\Test\\io_liu\\stream_io_test\\a.txt"); //抛出文件找不到问题FileNotFoundException
        //转换为字符流
        InputStreamReader ir = new InputStreamReader(fin);//包装后可以将字节装换成字符

        //2.读取
        int temp;
        while((temp = ir.read()) != -1){ //可以读中文了
            System.out.println((char)temp);
        }

        //3.关闭
        fin.close();

    }
}
