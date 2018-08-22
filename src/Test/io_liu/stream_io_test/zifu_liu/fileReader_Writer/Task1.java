package Test.io_liu.stream_io_test.zifu_liu.fileReader_Writer;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

//读取一个文件，逆序写入另一个文件
public class Task1 {
    public static void main(String[] args) throws IOException {
        File f = new File("D:\\IdeaProjects-workspace\\src\\Test\\io_liu\\stream_io_test\\f.txt");
        FileWriter fw = new FileWriter(f);
        String str = "ABCD1234";
        fw.write(str);
        fw.close();

        FileReader fr = new FileReader(f);
        int temp;
        StringBuffer sb = new StringBuffer(); //stringBuffer 能使用方法 append
        while((temp = fr.read()) != -1){
            sb.append((char)temp);
        }
        fr.read();
        fr.close();

        System.out.println(sb.reverse().toString());


    }
}
