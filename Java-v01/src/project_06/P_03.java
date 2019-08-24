package project_06;

/*
--------------------------------------------------------------------------------------------------------------------------------------------------
题目：Arrays.fill的作用:将Arrays.fill(arr, 100) 中的100赋值给arr[20]中的每一个元素。
Arrays.fill是一个工具类。
--------------------------------------------------------------------------------------------------------------------------------------------------
*/
public class P_03 {
    public static void main(String[] args) {
        int[] arr = new int[20];
//        Arrays.fill(arr, 100);

//        ArrayTool tool = new ArrayTool();
//        tool.fill(arr, 32);

//      当23行的方法改为公共类和进行私有化后可以直接当做工具类,无须进行new一个新的方法
        ArrayTool.fill(arr, 64);

        System.out.print(arr[0] + "\t" + arr[1] + "\t" + arr[18]);
    }
}
class ArrayTool {
    private ArrayTool(){}
    public static void fill(int[] arr, int number){
        for(int i = 0; i < arr.length; i++){
            arr[i] = number;
        }
    }
}