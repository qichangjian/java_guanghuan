package Test.fanshe.net.Socket3;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

//客户端

/**input读输入内存  内存output写输出*/
public class Client {
    public static void main(String[] args) throws UnknownHostException, IOException {
        //创建一个客户端
        //指定服务器的ip 和 端口InetAddress.getLocalHost()  == 127.0.0.1
        Socket socket = new Socket("127.0.0.1",5678);
        //流  获得底层的socket流
        InputStream is = socket.getInputStream();//socket提供的输入流
        OutputStream os = socket.getOutputStream();
        //包装流
        Scanner in = new Scanner(is);//读 把数据源换成读到的数据  读数据到内存也就是string变量
        PrintWriter out = new PrintWriter(os,true);  //true*******刷新缓冲区，很重要
        out.println("连接成功");

        //读
        String sr;
        while(true){
            //*******
            sr = in.nextLine(); //输入流 接受的数据存储在内存中
            if(sr.equals("end")){
                break;
            }
            System.out.println("服务器：" + sr);
        }

        //写
        Scanner input = new Scanner(System.in);
        String sw;
        while(true){
            System.out.println("客户端" + InetAddress.getLocalHost().getHostName() + "说：");
            sw = input.next();
            if(sw.equals("end")){
                out.println("客户端" + InetAddress.getLocalHost().getHostName() + ":退出连接");
                break;
            }
            //*******
            out.println(sw);//写的东西从内存输出出去
        }

        //关闭
        socket.close();
    }
}
