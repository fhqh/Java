package project_03;
/*
-------------------------------------------------------------------------
题目：数组里的元素倒序。
-------------------------------------------------------------------------
*/
public class P_05 {
    public static void main(String[] args) {
        int scoreArray[] = {12, 32, 32, 4, 5, 23, 334, 54, 45, 454, 356};
        for (int i = 0; i < scoreArray.length; i++){
            System.out.print(scoreArray[i] + "\t\t");
        }
        System.out.println();
        for (int i = 0; i < (scoreArray.length / 2); i++){
            int temp = scoreArray[i];
            scoreArray[i] = scoreArray[scoreArray.length - 1 - i];
            scoreArray[scoreArray.length - 1 - i] = temp;
        }
        for (int i = 0; i < scoreArray.length; i++){
            System.out.print(scoreArray[i] + "\t\t");
        }
    }
}
