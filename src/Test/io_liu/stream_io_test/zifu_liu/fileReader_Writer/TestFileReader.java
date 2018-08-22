package Test.io_liu.stream_io_test.zifu_liu.fileReader_Writer;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestFileReader {
    public static void main(String[] args) throws IOException {
        //读
        //1.创建对象
        FileReader fr = new FileReader("D:\\IdeaProjects-workspace\\src\\Test\\io_liu\\stream_io_test\\a.txt");
        //2.读
        /*System.out.println((char)fr.read());
        System.out.println((char)fr.read());
        System.out.println((char)fr.read());
        System.out.println((char)fr.read());
        System.out.println((char)fr.read());
        System.out.println((char)fr.read());
        System.out.println((char)fr.read());
        System.out.println((char)fr.read());*/
        int temp;
        while((temp = fr.read()) != -1){
            //System.out.println((char)fr.read());//不能两边read()
            System.out.println((char)temp);
        }
        //3.close
        fr.close();
    }
}
