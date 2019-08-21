package project_02;

import java.util.Random;

/*
-------------------------------------------------------------------------
题目：随机数的实例————02
代码中的seed和bound是idea编译器自动生成。
-------------------------------------------------------------------------
*/
//import java.util.Random;
public class P_02 {
    public static void main(String[] args) {
        Random ran1 = new Random();//此处seed的作用是使随机生成的数字不再发生变化。
        System.out.println("使用种子为10的Random对象生成[0,10)内随机整数序列: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(ran1.nextInt(10) + " ");//此处bound的作用是确定随机数的范围
        }
        System.out.println();
        Random ran2 = new Random(10);
        System.out.println("使用另一个种子为10的Random对象生成[0,10)内随机整数序列: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(ran2.nextInt(10) + " ");
        }
    }
}
