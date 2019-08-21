package project_04;

import java.util.Scanner;

/*
--------------------------------------------------------------------------------------------------------------------------------------------------
题目：在歌唱比赛中，共有10位评委进行打分，在计算歌手得分时，去掉一个最高分，去掉一个最低分，
然后剩余的8位评委的分数进行平均，就是该选手的最终得分。输入每个评委的评分，求某选手的得分。
--------------------------------------------------------------------------------------------------------------------------------------------------
*/
public class P_02 {
    public static void main(String[] args) {
        float[] scoreArray = new float[10];
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < scoreArray.length; i++){
            System.out.print("请输入第" + (i + 1) + "位评委的分数: ");
            scoreArray[i] = s.nextFloat();
        }
        float max = scoreArray[0];
        float min = scoreArray[0];
        for (int i = 1; i < scoreArray.length; i++){
            if (scoreArray[i] > max){
                max = scoreArray[i];
            }
            if (scoreArray[i] < min){
                min = scoreArray[i];
            }
        }
        float total = 0;
        for (int i = 0; i < scoreArray.length; i++){
            total += scoreArray[i];
        }
        System.out.println("该选手的最后得分是：" + (total - min - max) / (scoreArray.length - 2));
    }
}
