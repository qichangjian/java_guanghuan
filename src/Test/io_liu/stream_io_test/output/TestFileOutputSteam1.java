package Test.io_liu.stream_io_test.output;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//try catch 方式
public class TestFileOutputSteam1 {
    public static void main(String[] args){
        //把一个字符串，存到b.txt文件中
        FileOutputStream fout = null;//没有自动创建，但是父路径要有
        try {
            //1.创建流对象 false 会覆盖 true 会追加      参数
            fout = new FileOutputStream("D:\\IdeaProjects-workspace\\src\\Test\\io_liu\\stream_io_test\\b.txt",true);
            byte[] b = "hello".getBytes();
            fout.write(b);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //关闭
            if(fout != null){
                try {
                    fout.close();//还要trycatch
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
