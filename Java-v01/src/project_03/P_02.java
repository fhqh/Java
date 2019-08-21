package project_03;

/*
-------------------------------------------------------------------------
题目：请将A B C存入数组，然后再输出。
-------------------------------------------------------------------------
*/
public class P_02 {
    public static void main(String[] args) {
        char[] c = {'A', 'B', 'C'};
        char[] a = new char[3];
        a[0] = 'A';
        a[1] = 'B';
        a[2] = 'C';
        for (int i = 0; i < c.length; i++){
            System.out.println(c[i]);
        }
        for (int b = 0; b < a.length; b++){
            System.out.println(a[b]);
        }
    }
}
