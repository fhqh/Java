package project_04;
/*
------------------------------------------------------------------------------------
题目：定义一个数组来存储12个学生的成绩{72, 89, 65, 58, 87, 91, 53, 82, 71, 93, 76, 68},
计算并输出学生的平均成绩。
------------------------------------------------------------------------------------
*/
public class P_01 {
    public static void main(String[] args) {
        int[] scoreArray = {72, 89, 65, 58, 87, 91, 53, 82, 71, 93, 76, 68};
        int total = 0;
        for (int i = 0; i < scoreArray.length; i++){
            System.out.print(scoreArray[i] + "\t");
            total += scoreArray[i];
        }
        System.out.println();
        System.out.print("average = " + (float) total / scoreArray.length);
    }
}
