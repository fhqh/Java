package project_03;
/*
-------------------------------------------------------------------------
题目：现在有如下一个数组:
int oldArr[] = {1, 3, 4, 5, 0, 0, 6, 6, 0, 5, 4, 7, 6, 7, 0, 5};
要求将以上数组中的0项去掉,将不为0的值存入一个新的数组，生成新的数组为
int newArr[] = {1, 3, 4, 5, 6, 6, 5, 4, 7, 6, 7, 5};
-------------------------------------------------------------------------
*/
public class P_06 {
    public static void main(String[] args) {
        int oldArray[] = {1, 3, 4, 5, 0, 0, 6, 6, 0, 5, 4, 7, 6, 7, 0, 5};
        int count = 0;    //判断oldArray中有多少个非零元素。
        for (int i = 0; i < oldArray.length; i++){
            System.out.print(oldArray[i] + "\t");
            if (oldArray[i] != 0){
                count++;
            }
        }
        System.out.println();
        int newArray[] = new int[count];
        int number = 0;
        for (int i = 0; i < oldArray.length; i++){
            if (oldArray[i] != 0){
                newArray[number] = oldArray[i];
                number++;
            }
        }
        for (int i = 0; i < newArray.length; i++){
            System.out.print(newArray[i] + "\t");
        }
    }
}
