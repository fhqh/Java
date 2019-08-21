package project_02;
import java.util.ArrayList;
import java.util.Random;
/*
-------------------------------------------------------------------------
题目：随机数的实例————04
难度较高，日后观察。
-------------------------------------------------------------------------
*/
public class P_04 {
    public static void main(String[] args) {
        ArrayList list=new P_04().getDiffNO(10);
//        System.out.println();
        System.out.println("产生的n个不同的随机数："+list);
    }
    private ArrayList getDiffNO(int n) {
        // 生成 [0-n) 个不重复的随机数
        // list 用来保存这些随机数
        ArrayList list = new ArrayList();
        Random rand = new Random();
        boolean[] bool = new boolean[n];
        int num = 0;
        for (int i = 0; i < n; i++) {
            do {
                // 如果产生的数相同继续循环
                num = rand.nextInt(n);
            } while (bool[num]);
            bool[num] = true;
            list.add(num);
        }
        return list;
    }
}
/*
------------------------------------------------------------------------------------------------------------------------
protected int next(int bits)：生成下一个伪随机数。
boolean nextBoolean()：返回下一个伪随机数，它是取自此随机数生成器序列的均匀分布的boolean值。
void nextBytes(byte[] bytes)：生成随机字节并将其置于用户提供的 byte 数组中。
double nextDouble()：返回下一个伪随机数，它是取自此随机数生成器序列的、在0.0和1.0之间均匀分布的 double值。
float nextFloat()：返回下一个伪随机数，它是取自此随机数生成器序列的、在0.0和1.0之间均匀分布float值。
double nextGaussian()：返回下一个伪随机数，它是取自此随机数生成器序列的、呈高斯（“正态”）分布的double值，其平均值是0.0标准差是1.0。
int nextInt()：返回下一个伪随机数，它是此随机数生成器的序列中均匀分布的 int 值。
int nextInt(int n)：返回一个伪随机数，它是取自此随机数生成器序列的、在（包括和指定值（不包括）之间均匀分布的int值。
long nextLong()：返回下一个伪随机数，它是取自此随机数生成器序列的均匀分布的 long 值。
void setSeed(long seed)：使用单个 long 种子设置此随机数生成器的种子。
下面给几个例子：

生成[0,1.0)区间的小数：double d1 = r.nextDouble();
生成[0,5.0)区间的小数：double d2 = r.nextDouble() * 5;
生成[1,2.5)区间的小数：double d3 = r.nextDouble() * 1.5 + 1;
生成-231到231-1之间的整数：int n = r.nextInt();
生成[0,10)区间的整数：
　　　　int n2 = r.nextInt(10);//方法一
　　　　n2 = Math.abs(r.nextInt() % 10);//方法二
------------------------------------------------------------------------------------------------------------------------
*/