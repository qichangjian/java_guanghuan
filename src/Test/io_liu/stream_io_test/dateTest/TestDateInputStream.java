package Test.io_liu.stream_io_test.dateTest;

import java.io.*;

/**
 * 数据流
 */
public class TestDateInputStream {
    public static void main(String[] args) throws IOException {
        //写
        //1.得到流对象
        //简便写法
        DataOutputStream dout = new DataOutputStream(new FileOutputStream("D:\\IdeaProjects-workspace\\src\\Test\\io_liu\\stream_io_test\\c.txt"));
        //麻烦写法
        File f = new File("D:\\IdeaProjects-workspace\\src\\Test\\io_liu\\stream_io_test\\c.txt");
        FileOutputStream fout = new FileOutputStream(f);
        DataOutputStream dfout = new DataOutputStream((fout));

        //2.写 写入不同类型
        int[] no = {11,22,33};
        String[] name = {"aa","bb","cc"};
        for (int i = 0; i < no.length; i++) {
            dout.writeInt(no[i]);
            dout.writeUTF(name[i]); //编码方式utf
        }

        //3.关闭
        dout.close();

        //--------------------------------
        //读
        FileInputStream fin = new FileInputStream("D:\\IdeaProjects-workspace\\src\\Test\\io_liu\\stream_io_test\\c.txt");
        DataInputStream din = new DataInputStream(fin);
        for (int i = 0; i < no.length; i++) {
            System.out.println(din.readInt());
            System.out.println(din.readUTF());//读字符串
        }
        din.close();
    }
}
