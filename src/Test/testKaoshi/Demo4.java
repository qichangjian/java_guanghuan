package Test.testKaoshi;

//插入排序
public class Demo4 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] a={11,10,55,78,100,111,45,56,79,90,345,1000};//创建一个数组a
        System.out.println("排序之前：");
        Demo4.output(a);
        System.out.println();
        Demo4.Sort(a);
        System.out.println("排序之后：");
        Demo4.output(a);
    }
    //插入排序
    public static void Sort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int tempdata = arr[i];
            int j;
            for(j=i-1;j>=0;j--){
                if(arr[j]>tempdata){
                    arr[j+1] = arr[j];
                }else{
                    //Demo4.output(arr);
                    //System.out.println();
                    break;
                }
            }
            //arr[j+1] = tempdata;
        }
    }
    //输出打印
    public static void output(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
    }
}
