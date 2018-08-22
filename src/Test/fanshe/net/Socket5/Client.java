package Test.fanshe.net.Socket5;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 *  多线程实现
 *      多个客户端
 *      输入没有限制
 */
public class Client extends Thread {

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 5678);
        Scanner in = new Scanner(socket.getInputStream());
        PrintWriter out = null;//一定要刷新啊 别漏了
        out = new PrintWriter(socket.getOutputStream(), true);
        Scanner input = new Scanner(System.in);
        String sr, inputString;
        while (true) {
            while (true) {
                sr = in.nextLine();
                System.out.println("服务器：" + sr);
                if (sr.equals("q")) {
                    break;
                }
            }
            while (true) {
                System.out.println("input：");
                inputString = input.next();
                out.println(inputString);
                if (inputString.equals("q")) {
                    break;
                }
            }

            if (inputString.equals("exit")) {
                break;
            }
        }
        socket.close();
    }
}
