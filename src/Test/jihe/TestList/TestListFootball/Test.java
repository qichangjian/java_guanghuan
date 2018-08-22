package Test.jihe.TestList.TestListFootball;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//把十六个球队随机分为四组
public class Test {
    public static void main(String[] args) {
        List<Football> footballs = new ArrayList<>();
        footballs.add(new Football("科特第瓦"));
        footballs.add(new Football("阿根廷"));
        footballs.add(new Football("澳大利亚"));
        footballs.add(new Football("塞尔维亚"));

        footballs.add(new Football("荷兰"));
        footballs.add(new Football("尼日利亚"));
        footballs.add(new Football("日本"));
        footballs.add(new Football("美国"));

        footballs.add(new Football("中国"));
        footballs.add(new Football("新西兰"));
        footballs.add(new Football("比利时"));
        footballs.add(new Football("巴西"));

        footballs.add(new Football("韩国"));
        footballs.add(new Football("洪都拉斯"));
        footballs.add(new Football("噶麦隆"));
        footballs.add(new Football("意大利"));

        Random random = new Random();
        Football s;
        for (int i = 0; i < 4; i++) {
            System.out.println("第" + (i+1) + "组：");
            for (int j = 0; j < 4; j++) {
                s = footballs.get(random.nextInt(footballs.size()));
                System.out.print(s + "\t");
                footballs.remove(s);//去掉就不会重复了
            }
            System.out.println();
        }
    }
}
