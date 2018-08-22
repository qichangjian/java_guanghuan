package Test.io_liu.stream_io_test.Task1;

import java.io.*;

public class copyPicture {
    public static void main(String[] args) throws IOException {
       /* FileInputStream fin = new FileInputStream("D:/a.JPG");
        FileOutputStream fout = new FileOutputStream("D:/b.JPG");
        byte[] bin = new byte[fin.available()];
        */
       /*int temp;
        while((temp = fin.read()) != -1){
            fout.write(temp);
        }*/
       /*
        fin.read(bin);
        fout.write(bin);
        fout.close();
        fin.close();*/

        /**缓冲流     缓冲流包装提高效率高
         *               新学的
         */
        FileInputStream fin = new FileInputStream("D:/a.JPG");
        BufferedInputStream bfin = new BufferedInputStream(fin);//缓冲区大小为：8192大小
        FileOutputStream fout = new FileOutputStream("D:/b.JPG");
        BufferedOutputStream bfout = new BufferedOutputStream(fout);
        int temp;
        while((temp = bfin.read()) != -1){
            bfout.write(temp);
        }
        bfout.flush();//强制刷新缓冲区的内容

        bfout.close();
        bfin.close();
    }
}
