package Test.fanshe.net.Socket5;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 *    两边都能输入，但是每次只接受一句话，循环输入
 */
public class Server extends Thread{
    Socket socket;

    public Server(Socket socket) {
        this.socket = socket;
    }

    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(5678);
        while(true){
            Socket socket = server.accept();
            Server server1 = new Server(socket);
            Thread t = new Thread(server1);
            t.start();
        }

    }

    @Override
    public void run() {

        try {
            Scanner in = null;
            in = new Scanner(socket.getInputStream());
            PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
            Scanner input = new Scanner(System.in);
            out.println("服务器连接成功!");
            out.println("q");
            String getString,inputString;
            while(true){
                while(true){
                    getString = in.nextLine();
                    System.out.println("客户端：" + getString);
                    if(getString.equals("q")){
                        break;
                    }
                }
                while(true){
                    System.out.println("input：");
                    inputString = input.next();
                    out.println(inputString);
                    if(inputString.equals("q")){
                        break;
                    }
                }
                if(inputString.equals("exit")){
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
