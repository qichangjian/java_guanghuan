package Test.fanshe.net.Socket4;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 *    两边都能输入，但是每次只接受一句话，循环输入
 */
public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(5678);
        Socket socket = server.accept();
        Scanner in = new Scanner(socket.getInputStream());
        PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
        Scanner input = new Scanner(System.in);
        out.println("服务器连接成功!");
        //String getString = "",inputString = "";
        String getString,inputString;
        while(true){
            getString = in.nextLine();
            System.out.println("客户端：" + getString);
            System.out.println("input：");
            inputString = input.next();
            out.println(inputString);
            /*if(getString.equals("exit")){
                break;
            }*/
            if(inputString.equals("exit")){
                break;
            }
        }
        socket.close();
    }
}
