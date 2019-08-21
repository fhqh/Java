package project_04;

import java.util.Scanner;

/*
--------------------------------------------------------------------------------------------------------------------------------------------------
题目：声明一个int型的数组，循环接收8个学生的成绩，计算这8个学生的总分及平均分最高分和最低分。
--------------------------------------------------------------------------------------------------------------------------------------------------
*/
public class P_03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] scoreArray = new int[8];
        int total = 0;
        for (int i = 0; i < scoreArray.length; i++) {
            System.out.print("第" + (i + 1) + "位学生的成绩是：");
            scoreArray[i] = s.nextInt();
            total += scoreArray[i];
        }
        System.out.println("8位学生的总成绩是：" + total);
        System.out.println("8位学生的平均成绩是：" + (float) total / scoreArray.length);
        int max = scoreArray[0];
        int min = scoreArray[0];
        for (int i = 1; i < scoreArray.length; i++) {
            if (scoreArray[i] > max) {
                max = scoreArray[i];
            }
            if (scoreArray[i] < min) {
                min = scoreArray[i];
            }
        }
        System.out.print("最高分是：" + max + "\n" + "最低分是：" + min);
    }
}
