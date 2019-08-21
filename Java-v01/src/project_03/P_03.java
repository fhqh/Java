package project_03;
/*
-------------------------------------------------------------------------
题目：复制数组，将数组里面的数据全部复制到另一个数组里面。
-------------------------------------------------------------------------
*/
public class P_03 {
    public static void main(String[] args) {
        int scoreArray[] = {1, 3, 443, 443, 3, 43, 34};
        int newArray[] = new int[scoreArray.length];
        for (int i = 0; i < scoreArray.length; i++){
            newArray[i] = scoreArray[i];
            System.out.print(newArray[i] + "  ");
        }
    }
}
