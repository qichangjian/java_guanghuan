package Test.io_liu.stream_io_test.zifu_liu.fileReader_Writer;

import java.io.FileWriter;
import java.io.IOException;

public class TestFileWriter {
    public static void main(String[] args) throws IOException {
        //写string s
        //1.
        FileWriter fw = new FileWriter("D:\\IdeaProjects-workspace\\src\\Test\\io_liu\\stream_io_test\\a.txt");
        //2
        String s = "hello您好啊";
        fw.write(s);
        fw.close();
    }
}
