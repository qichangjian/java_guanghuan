package Test.fanshe.net.Socket3;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 *   加入多线程实现多个客户端任意传输数据
 */
class MyThread implements Runnable{
    Socket socket;
    MyThread(Socket socket){
        this.socket = socket;
    }
    @Override
    public void run() {
        //分配socket的流
        InputStream is = null;
        try {
            is = socket.getInputStream();
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
                //是否读到信息
                if(in.hasNextLine()){
                    //*******
                    sr = in.nextLine();
                    System.out.println("客户端：" + sr);
                    if(sr.equals("end")){
                        break;
                    }

                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //关闭socket客服
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }




    }
}
//服务端 连接一个客户端
public class Server {
    public static void main(String[] args) throws IOException {
        //服务器
        ServerSocket server = new ServerSocket(5678);//端口必须一致
        while(true) {
            //服务器分配一个socket 获得一个客户端连接
            Socket socket = server.accept();
            MyThread my = new MyThread(socket); //每次连接一个客户端，就生成一个线程
            Thread t = new Thread(my);
            t.start();
        }
    }
}
