package day3;

/**
 * 任务二：计算可乐瓶数
 * 50瓶可乐，每喝三瓶给你一瓶，请问最后喝了多少瓶.
 */
public class Task2 {
    static int give = 0;
    static int pNum = 50;
    public static void main(String[] args) {
        //方法一
        /*int num = 50;
        int giveCount = 0;
        while(num >= 0){
            if(num >=3){
                num = num - 3;
                giveCount ++;
                num ++;
            }else{
                num = -1;
            }
        }
        System.out.println("总共喝了：" + (50 + giveCount) + "瓶");*/
        giveNum(pNum);
    }

    //方法二：递归方法
    public static void giveNum(int num){
        int nums = num;
        if(num < 3){
            System.out.println("总共喝了：" + (pNum + give) + "瓶");
        }else{
            num = num - 2;
            give ++;
            giveNum(num);
        }
    }
}
