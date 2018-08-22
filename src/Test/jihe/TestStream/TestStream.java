package Test.jihe.TestStream;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class TestStream {
    public static void main(String[] args) {
        //Stream
        IntStream is = IntStream.builder().add(11).add(22).add(33).build();
        //获得最大值max
        //System.out.println(is.max().getAsInt());
        //获得最小值min
        //System.out.println(is.min().getAsInt());//注意【流只能用一次】
        //sum求总和
        //System.out.println(is.sum());
        //平均值average
        //System.out.println(is.average().getAsDouble());
        //个数
        //System.out.println(is.count());
        //是否所有元素都满足条件
        //匿名
        /*System.out.println(is.allMatch(new IntPredicate() {
            @Override
            public boolean test(int value) {
                return value > 20;//所有的元素都满足这个条件
            }
        }));*/
        //lambda表达式
        //System.out.println(is.allMatch(v -> v>10));

        //是否至少有一个满足条件
        //System.out.println(is.anyMatch(v -> v > 20));

        //过滤，中间方法，返回一个流
        //is.filter(v -> v>20).forEach(System.out::println);//is.filter(v -> v>20)得到一个新的流 .在调用方法foreach


    }
}
