package project_03;
/*
-------------------------------------------------------------------------
题目：取得一个数组里面的最大值和最小值
-------------------------------------------------------------------------
*/
public class P_04{
    public static void main(String[] args) {
        int[] scoreArray = {25, 23, 23, 4, 45, 5, 67, 6, 45, 23, 112, 12};
        int max = scoreArray[0];
        int min = scoreArray[0];
        for (int i = 1; i < scoreArray.length; i++){
            if (scoreArray[i] > max){
                max = scoreArray[i];
            }
            if (scoreArray[i] < min){
                min = scoreArray[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}