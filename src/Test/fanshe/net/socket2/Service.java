package Test.fanshe.net.socket2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

//服务端 可以连接多个客户端
public class Service {
    public static void main(String[] args) throws IOException {
        //服务器
        ServerSocket server = new ServerSocket(5678);//端口必须一致

        while(true){
            //服务器分配一个socket
            Socket socket = server.accept();//相当于客服
            //分配socket的流
            InputStream is = socket.getInputStream();
            OutputStream os = socket.getOutputStream();
            //包装流
            Scanner in = new Scanner(is);
            PrintWriter out = new PrintWriter(os,true);

            //写个信息提示客户端
            //*******
            out.println("服务器连接成功");
            out.println("end");

            //服务器读
            String sr;
            while(true){
                if(in.hasNextLine()){
                    sr = in.nextLine();
                    System.out.println("客户端：" + sr);
                    if(sr.equals("end")){
                        break;
                    }
                }
            }
            //关闭socket客服
            socket.close();
        }

    }
}
