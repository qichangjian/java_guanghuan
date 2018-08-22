package Test.fanshe.net;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

//下载url资源
public class TestURL1 {
    public static void main(String[] args) {
        URL url = null;
        try {
            url = new URL("https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=1552263849,786703273&fm=15&gp=0.jpg");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        try(
        InputStream in = url.openStream();
        OutputStream out = new FileOutputStream("d:/aa.JPG")
        ){
            int temp;
            while((temp = in.read()) != -1){//读取url图片
                out.write(temp);//写入磁盘
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
