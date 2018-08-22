package Test.jihe.TestPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * 定义一个图书馆类
 *  实现过滤
 */
public class Task1Predicate {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("java",22));
        books.add(new Book("javajava",22));
        books.add(new Book("javaa",11));
        books.add(new Book("javab",33));
        books.add(new Book("javac",5));
        books.add(new Book("python",30));

        Task1Predicate task1Predicate = new Task1Predicate();
        //调用方法，以及实现接口中的test方法
        task1Predicate.showJavaBook(books,s->s.getName().contains("java") && s.getName().length() <= 5 && s.getPrice() <= 20);
    }

    public void showJavaBook(List<Book> bookList, Predicate<Book> bookPredicate){
        for (Book b: bookList) {//循环List
            if(bookPredicate.test(b)){//调用接口中test方法
                System.out.println(b);//符合条件就输出
            }
        }
    }
}

class Book{
    private String name;
    private int price;

    public Book() {
    }

    public Book(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
