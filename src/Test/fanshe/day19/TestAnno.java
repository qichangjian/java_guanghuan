package Test.fanshe.day19;

import java.lang.annotation.*;
import java.util.Arrays;

/**
 * 自定义注解
 */
public class TestAnno {
    public static void main(String[] args) throws NoSuchFieldException {
        //反射获得注解的信息
        //1.获得父类的注解信息
        Class<Fuit> cf = Fuit.class;
        Annotation[] ans = cf.getDeclaredAnnotations();
        Arrays.stream(ans).forEach(System.out::println);
        //2.获得子类的注解信息
        Class<Apple> ca = Apple.class;
        Annotation[] ans1 = ca.getAnnotations();//因为私有不继承
        Arrays.stream(ans1).forEach(System.out::println);

        //3.子类属性 上也有注解
        // 得到属性，之后再得到注解
        Annotation[] ans2 = ca.getDeclaredField("color").getAnnotations();
        Arrays.stream(ans2).forEach(System.out::println);

    }
}
//给水果自己写的自定义注解
@Documented  //生成帮助文档的时候显示注解信息
@Inherited  //子类可以继承父类的注解  但是注意类型得是type
@Retention(RetentionPolicy.RUNTIME)//存活时间    在运行期可以获得注解信息
@Target(ElementType.TYPE)//只能在定义类的时候使用  范围限制
@interface FuitAnno{
    String value() default "Fuit";//没指定采取默认值
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface AppleColorAnno{
    Color color() default Color.RED;
}

//这里使用注解
@FuitAnno(value="Apple")//自己可以写一些value 描述信息
class Fuit{
    private String name;
    int no;
}
enum Color{
    RED,YELLOW,GREEN;
}
class Apple extends Fuit{
    //使用注解
    @AppleColorAnno(color = Color.YELLOW)
    Color color;
}
