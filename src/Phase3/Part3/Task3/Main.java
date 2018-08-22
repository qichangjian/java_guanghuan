package Phase3.Part3.Task3;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Set<Shop> shops = new HashSet<>();
        Shop shop1 = new Shop(1,"商品1",20);
        Shop shop2 = new Shop(2,"商品2",22);
        Shop shop3 = new Shop(3,"商品3",22);
        shops.add(shop1);
        shops.add(shop2);
        shops.add(shop3);

        //序列化
        File f = new File("d:/Dest.txt");
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(shops);
        oos.close();

        //反序列化
        FileInputStream fin = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fin);
        Set<Shop> s = (HashSet<Shop>)ois.readObject();
        for (Shop ss:s) {
            System.out.println(ss.getMoney() + ss.getNo() + ss.getName());
        }


    }
}
