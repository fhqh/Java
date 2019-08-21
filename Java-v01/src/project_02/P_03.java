package project_02;

import java.util.Random;

/*
-------------------------------------------------------------------------
题目：随机数的实例————03。
-------------------------------------------------------------------------
*/
public class P_03 {
    public static void main(String[] args) {
//       Random ran1 = new Random(10);   例2和例3对比可得，缺少此行相当于删除seed。
        // 在没带参数构造函数生成的Random对象的种子缺省是当前系统时间的毫秒数。
        Random r3 = new Random();
//        System.out.println();
        System.out.println("使用种子缺省是当前系统时间的毫秒数的Random对象生成[0,10)内随机整数序列");
        for (int i = 0; i < 10; i++) {
            System.out.print(r3.nextInt(10)+" ");
        }
    }

}
