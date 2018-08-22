package Test.io_liu.stream_io_test.zifu_liu.buffer_Reader;

import java.io.*;
//缓冲流
public class TestBufferReader{
    public static void main(String[]args) throws IOException {
        //读
        //1
        File f = new File("D:\\IdeaProjects-workspace\\src\\Test\\io_liu\\stream_io_test\\f.txt");
        FileReader fw = new FileReader(f);
        BufferedReader bf = new BufferedReader(fw);

        //2
        String s;
        while((s = bf.readLine()) != null){
            System.out.println(s);
        }

        //3
        bf.close();

        //写
        FileWriter fwr = new FileWriter(f);
        BufferedWriter bw = new BufferedWriter(fwr);
        String ss = "jiushijiuni jisu \n\t dlkfaflk";
        for (int i = 0; i < 5; i++) {
            bw.write(ss);
        }

        bw.close();

    }
}
