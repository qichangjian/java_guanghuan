package Test.fanshe.net.Socket4;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",5678);
        Scanner in = new Scanner(socket.getInputStream());
        PrintWriter out = new PrintWriter(socket.getOutputStream(),true);//一定要刷新啊 别漏了
        Scanner input = new Scanner(System.in);
        //String sr = "",inputString =""; //变量初始化没有赋值，在下边if语句出现错误
        String sr,inputString;
        while(true){
            //读
            sr = in.nextLine();
            System.out.println("服务器：" + sr);
            System.out.println("input：");
            inputString = input.next();
            out.println(inputString);
            /*if(sr.equals("exit")){   //这里处了问题 变量要初始化
                break;
            }*/
            if(inputString.equals("exit")){
                break;
            }
        }
        socket.close();
    }
}
