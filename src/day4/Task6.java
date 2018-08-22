package day4;

/**
 *任务六：
 * 现有如下一个数组：   int oldArr[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5}   要求将以上数组中值为0的项去掉，将不为0的值存入一个新的数组，生成的新数组为：
 *     int newArr [] ={1,3,4,5,6,6,5,4,7,6,7,5}
 */
public class Task6 {
    public static void main(String[] args) {
        int[] oldArr={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
        int[] newArrs = new int[oldArr.length];
        int newArrIndex = 0;
        for(int i = 0; i < oldArr.length; i ++){
            if(oldArr[i] != 0){
                newArrs[newArrIndex] = oldArr[i];
                newArrIndex ++;
            }
        }
        int[] newArr = new int[newArrIndex];
        for (int i = 0; i < newArrIndex; i++) {
            newArr[i] = newArrs[i];
        }

        for (int aa:newArr) {
            System.out.println(aa);
        }
    }
}
