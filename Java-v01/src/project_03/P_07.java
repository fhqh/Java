package project_03;
/*
-------------------------------------------------------------------------
题目：数据查找，有一个数组，里面存储是是整数，从这个里面查找一个指定整数，找到这个
整数所在位置(索引位置)。(查找第一个出现的位置)
-------------------------------------------------------------------------
*/

import java.util.Scanner;

public class P_07 {
    public static void main(String[] args) {
        int[] sorceArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Scanner s = new Scanner(System.in);
        System.out.print("请输入要判断的数字：");
        int number = s.nextInt();
        int a = -1;
        for (int i = 0; i < sorceArray.length; i++){
            if (number == sorceArray[i]){
                a = (i + 1);
                break;
            }
        }
        if (a != -1){
            System.out.print("您输入的数字在数组的第" + a + "位置上。");
        }
        else {
            System.out.print("对不起，您输入的数字不在该数组的范围内。");
        }
    }
}
