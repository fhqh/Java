package project_05;
/*
--------------------------------------------------------------------------------------------------------------------------------------------------
题目：填充数组的方法。(把数组按照某个值统一进行赋值相当于Array.fi11)
--------------------------------------------------------------------------------------------------------------------------------------------------
*/
public class P_05 {
    public static void main(String[] args) {
        int[] a = {1, 3, 4, 5, 6, 45, 6};
        System.out.print(a[0] + "\t");
        System.out.print(a[1] + "\t");
        System.out.print(a[2] + "\t");
        System.out.print(a[3] + "\t");
        System.out.print(a[4] + "\t");
        System.out.print(a[5] + "\t");
        System.out.println();

        fill(a, 30);
        System.out.print(a[0] + "\t");
        System.out.print(a[1] + "\t");
        System.out.print(a[2] + "\t");
        System.out.print(a[3] + "\t");
        System.out.print(a[4] + "\t");
        System.out.print(a[5] + "\t");
        System.out.println();

        fill(null, 2);
        System.out.print(a[0] + "\t");
        System.out.print(a[1] + "\t");
        System.out.print(a[2] + "\t");
        System.out.print(a[3] + "\t");
        System.out.print(a[4] + "\t");
        System.out.print(a[5] + "\t");
    }
    public static void fill(int[] array, int value){
        if (array == null){
            System.out.println("输入有误，请检查后再重新操作。");
            return;
        }
        for (int i = 0; i < array.length; i++){
            array[i] = value;
        }
    }
}
