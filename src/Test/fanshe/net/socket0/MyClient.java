package Test.fanshe.net.socket0;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *  网上的  tcp  方式
 */
public class MyClient {

    public static void main(String[] args) throws Exception{

        Socket socket = null;
        BufferedReader in = null;
        PrintWriter out = null;

        BufferedReader input = null;
        // 请求指定ip和端口号的服务器
        socket = new Socket("127.0.0.1",3333);

        while(true){

            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));//输入流读 串过来的数据

            out = new PrintWriter(socket.getOutputStream(), true);
            // 接收控制台的输入
            input = new BufferedReader(new InputStreamReader(System.in));//控制台输入内存中
            // out.println("this is client info!");
            String info = input.readLine(); //接收控制台的输入

            /**这两步骤重要*/
            out.println(info);     //控制台输入的数据  输出到  客户端内存
            String str = in.readLine(); //传过来的数据

            System.out.println("客户端显示--》服务器的信息：" + str);
        }
        //in.close();
        //out.close();
    }

}