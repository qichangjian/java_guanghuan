package Test.lambda;

public class Main1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        ArrayImpl a = new ArrayImpl();
        //匿名内部类实现
        a.display(arr, new InfoArray() {
            @Override
            public void reverse(int[] arr) {
                for (int i = 0; i < arr.length; i++) {
                    System.out.println(arr[arr.length - 1 - i]);
                }
            }
        });

        //lambda表达式实现
        a.display(arr,(arr1) -> {for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[arr1.length - 1 - i]);
        }});
    }
}

class ArrayImpl {
    //调用函数式接口
    void display(int[] arr,InfoArray info){
        info.reverse(arr);
    }
}

//函数式接口
interface InfoArray{
    void reverse(int[] arr);
}