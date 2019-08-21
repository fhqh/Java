package project_05;
/*
--------------------------------------------------------------------------------------------------------------------------------------------------
方法的初步使用————03————方法之间的相互调用
--------------------------------------------------------------------------------------------------------------------------------------------------
*/
public class P_03 {
    public static void main(String[] args) {
        int x = 213, y = 3;
        int a = max_1(x, y);
        int b = max_1(42, 34);
        int c = max_2(32, 54, 5645);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    public static int max_1(int x, int y) {
        if (x > y){
            return x;
        }
        else {
            return y;
        }
    }
    public static int max_2(int x, int y, int z){
        int a = max_1(x, y);
        int b = max_1(a, z);
//        System.out.println(b);
        return b;
    }
}
