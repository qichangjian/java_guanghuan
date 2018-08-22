package Test.lambda;

import java.util.Arrays;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntUnaryOperator;

public class Main {

    public static void main(String[] args) {
        //lambda表达式方法
        Str str = (String strings,int start,int end) -> { return strings.substring(start,end);};
        //方法引用 方法
        Str str1 = String::substring;

        //调用
        String test = str.subStr("123456789",2,5);
        String test1 = str1.subStr("123456789",2,4);

        //测试
        System.out.println(test);
        System.out.println(test1);
        System.out.println("-----------------Arrays类:函数式接口--------------------------------");
        int [] arr = {1,2,3,4,5};
        //用索引替换数组中的元素
        //一元运算
      /*  Arrays.parallelSetAll(arr, new IntUnaryOperator() {
            @Override
            public int applyAsInt(int operand) {
                return operand;
            }
        });
        System.out.println(Arrays.toString(arr));*/
        //lambda表达式书写
       /* Arrays.parallelSetAll(arr,index -> index);
        System.out.println(Arrays.toString(arr));*/

       //二元运算
        //用二元运算的结果，来代替数组的每一个元素
        /*Arrays.parallelPrefix(arr, new IntBinaryOperator() {
            //left前一个元素， right 当前元素
            @Override
            public int applyAsInt(int left, int right) {
                //当前元素是第一个元素，前一个元素是1
                return left * right;
            }
        });
        System.out.println(Arrays.toString(arr));*/

        //lambda表达式方法
       /* Arrays.parallelPrefix(arr,(left,right)->left*right);
        System.out.println(Arrays.toString(arr));*/

       //遍历数组，string流的方法
        Arrays.stream(arr).forEach(new IntConsumer() {
            @Override
            public void accept(int value) {
                System.out.println(value);
            }
        });
        //lambda表达式
        Arrays.stream(arr).forEach(value -> System.out.println(value));
        //方法引用方式
        Arrays.stream(arr).forEach(System.out::println);

    }

    interface Str{
        String subStr(String strings,int start,int end);
    }
}
