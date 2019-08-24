package project_05;
/*
--------------------------------------------------------------------------------------------------------------------------------------------------
方法的初步使用————04————方法重载(overload)
--------------------------------------------------------------------------------------------------------------------------------------------------
*/
public class P_04 {
    public static void main(String[] args) {
        float a = max (32.32f, 3.4f);
        int b = max (34, 45, 3243);
        int c = max (2, 3);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(max(32, 34, 343.3f));
    }

    public static int max(int x, int y) {
        if (x > y){
            return x;
        }
        else {
            return y;
        }
    }
    public static int max(int x, int y, int z){
        int a = max(x, y);
        int b = max(a, z);
//        System.out.println(b);
        return b;
    }
    public static float max(float x, float y){
        return x > y ? x : y;
    }
    public static float max(float x, float y, float z){
        float max;
        max = x > y ? x : y;
        max = max > z ? max : z;
        return max;
    }
}
