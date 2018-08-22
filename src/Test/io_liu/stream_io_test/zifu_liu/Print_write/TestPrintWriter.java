package Test.io_liu.stream_io_test.zifu_liu.Print_write;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
//printWriter
public class TestPrintWriter {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("D:\\IdeaProjects-workspace\\src\\Test\\io_liu\\stream_io_test\\number.txt");
        PrintWriter pw = new PrintWriter(f);

        //循环一次写一次
        for (int i = 0; i < 5; i++) {
            pw.println("第" + i +"个数字");
        }

        pw.close();

    }
}
